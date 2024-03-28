package org.example.springnauka.zad1_abstract;

import org.example.springnauka.zad1_abstract.dto.PlusShopInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
@Profile("shop-plus")
public class PlusShopService extends BasicShopService {
    private final PlusShopInfo plusShopInfo;

    public PlusShopService(PlusShopInfo plusShopInfo) {
        super();
        this.plusShopInfo = plusShopInfo;
    }


    @Override
    public BigDecimal calculateTotalPrice() {
        BigDecimal totalPrice = super.calculateTotalPrice()
                .multiply(BigDecimal.ONE.add(plusShopInfo.getVat()));

        System.out.println("plus total price: " + totalPrice);

        return totalPrice;
    }
}
