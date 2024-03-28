package org.example.springnauka.zad1_abstract.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Getter
@Setter
@ConfigurationProperties(prefix = "shop-pro")
@Component
public class ProShopInfo {
    private BigDecimal discount;
}
