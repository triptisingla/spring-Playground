package com.example.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

/**
 * Indicates that an annotated class is a "component". Such classes are
 * considered as candidates for auto-detection when using
 * annotation-based configuration like @ComponentScan and classpath scanning.
 * @Component is a stereotype annotation
 */
@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void helloWorld(){
        System.out.println("Hello World");
    }

    @PostConstruct
    public void intialize(){
        System.out.println("In Post construct menthod");
        this.name="Honda";
    }
    
}
