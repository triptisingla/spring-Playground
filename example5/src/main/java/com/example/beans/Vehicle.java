package com.example.beans;

import org.springframework.stereotype.Component;

/**
 * Indicates that an annotated class is a "component". Such classes are
 * considered as candidates for auto-detection when using
 * annotation-based configuration like @ComponentScan and classpath scanning.
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
    
}
