package org.example.springnauka.zad1_interface;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.math.BigDecimal;

public interface Shop {
    @EventListener(ApplicationReadyEvent.class)
    BigDecimal calculateTotalPrice();
}
