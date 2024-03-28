package org.example.springnauka.zad1_interface.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Getter
@Setter
@ConfigurationProperties(prefix = "shop-plus-interface")
@Component
public class PlusShopInfoInterface {
    private BigDecimal vat;
}
