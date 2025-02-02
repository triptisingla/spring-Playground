package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    /**
     * Constructs a Person object and injects the specified Vehicle dependency.
     *
     * @param vehicle the Vehicle object to be associated with this Person
     * Can use final here, production purpose
     */
    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person Bean Created");
        this.vehicle=vehicle;
    }

    private String name="Lucy";
    private Vehicle vehicle;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

//    @Autowired
    public void setVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }

}
