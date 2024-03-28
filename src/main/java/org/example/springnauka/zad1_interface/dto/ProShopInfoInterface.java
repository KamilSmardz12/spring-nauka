package org.example.springnauka.zad1_interface.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Getter
@Setter
@ConfigurationProperties(prefix = "shop-pro-interface")
@Component
public class ProShopInfoInterface {
    private BigDecimal discount;
}
