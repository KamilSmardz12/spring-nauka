package org.example.springnauka.zad1_interface;

import org.example.springnauka.zad1_interface.dto.PlusShopInfoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
@Profile("shop-plus-interface")
public class PlusShopServiceInterface implements Shop {
    private final Shop shopService;
    private final PlusShopInfoInterface plusShopInfo;

    @Autowired
    public PlusShopServiceInterface(@Qualifier("basicShopServiceInterface") Shop shopService, PlusShopInfoInterface plusShopInfo) {
        this.shopService = shopService;
        this.plusShopInfo = plusShopInfo;
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        BigDecimal totalPrice = shopService.calculateTotalPrice()
                .multiply(BigDecimal.ONE.add(plusShopInfo.getVat()));

        System.out.println("plus total price: " + totalPrice);

        return totalPrice;
    }
}
