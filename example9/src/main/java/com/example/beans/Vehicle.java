package com.example.beans;

public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle Bean Created");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void helloWorld() {
        System.out.println("Hello World");
    }

    @Override
    public String toString() {
        return "Vehicle [name=" + name + "]";
    }


}
