package org.example.springnauka.zad1_abstract;

import org.example.springnauka.zad1_abstract.dto.PlusShopInfo;
import org.example.springnauka.zad1_abstract.dto.ProShopInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Profile("shop-pro")
public class ProShopService extends PlusShopService {
    private final ProShopInfo proShopInfo;

    @Autowired
    public ProShopService(PlusShopInfo plusShopInfo, ProShopInfo proShopInfo) {
        super(plusShopInfo);
        this.proShopInfo = proShopInfo;
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        BigDecimal totalPrice = super.calculateTotalPrice()
                .multiply(BigDecimal.ONE.subtract(proShopInfo.getDiscount()));

        System.out.println("pro total price: " + totalPrice);

        return totalPrice;
    }

}
