package org.example.springnauka.zad0;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "page-info")
public class PageInfo2 {
    private String autor;
    private int creationDate;

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("2.1. autor: " + autor);
        System.out.println("2.2. creationDate: " + creationDate);
    }
}
