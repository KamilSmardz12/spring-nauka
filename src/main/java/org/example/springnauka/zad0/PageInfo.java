package org.example.springnauka.zad0;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PageInfo {
    @Value("${page-info.autor}")
    private String autor;

    @Value("${page-info.creationDate}")
    private int creationDate;

//    @EventListener(ApplicationEvent.class)
    public void get() {
        System.out.println("1.1. autor: " + autor);
        System.out.println("1.2. creationDate: " + creationDate);
    }
}
