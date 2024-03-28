package org.example.springnauka.zad1_interface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Profile("shop-basic-interface")
public class BasicShopServiceInterface implements Shop {
    private final List<Product> products;

    public BasicShopServiceInterface() {
        this.products = new ArrayList<>();
        products.add(new Product("Audi 1", BigDecimal.valueOf(3)));
        products.add(new Product("Audi 2", BigDecimal.valueOf(10)));
        products.add(new Product("Audi 3", BigDecimal.valueOf(12)));
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        BigDecimal totalPrice = products
                .stream()
                .map(Product::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("basic total price: " + totalPrice);

        return totalPrice;
    }

}
