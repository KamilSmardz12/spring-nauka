package org.example.springnauka.zad1_abstract;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Profile("shop-basic")
public class BasicShopService {
    private final List<Product> products;

    public BasicShopService() {
        this.products = new ArrayList<>();
        products.add(new Product("Audi 1", BigDecimal.valueOf(3)));
        products.add(new Product("Audi 2", BigDecimal.valueOf(10)));
        products.add(new Product("Audi 3", BigDecimal.valueOf(12)));
    }

    @EventListener(ApplicationReadyEvent.class)
    public BigDecimal calculateTotalPrice() {
        BigDecimal totalPrice = products
                .stream()
                .map(Product::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("basic total price: " + totalPrice);

        return totalPrice;
    }

}
