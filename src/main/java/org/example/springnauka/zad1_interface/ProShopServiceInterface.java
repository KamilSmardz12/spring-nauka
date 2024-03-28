package org.example.springnauka.zad1_interface;

import org.example.springnauka.zad1_interface.dto.ProShopInfoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Profile("shop-pro-interface")
public class ProShopServiceInterface implements Shop {
    private final Shop shop ;

    private final ProShopInfoInterface proShopInfo;

    @Autowired
    public ProShopServiceInterface(@Qualifier("plusShopServiceInterface") Shop shop, ProShopInfoInterface proShopInfo) {
        this.shop = shop;
        this.proShopInfo = proShopInfo;
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        BigDecimal totalPrice = shop.calculateTotalPrice()
                .multiply(BigDecimal.ONE.subtract(proShopInfo.getDiscount()));

        System.out.println("pro total price: " + totalPrice);

        return totalPrice;
    }
}
