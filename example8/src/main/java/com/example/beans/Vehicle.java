package com.example.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
 * Indicates that an annotated class is a "component". Such classes are
 * considered as candidates for auto-detection when using
 * annotation-based configuration like @ComponentScan and classpath scanning.
 * @Component is a stereotype annotation
 */
public class Vehicle {
    private String name;
    private Integer price;
    public String getName() {
        return name;
    }  

    public void setName(String name) {
        this.name = name;
    }

    
    public void helloWorld(){
        System.out.println("Hello World");
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
