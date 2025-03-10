package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    public Person() {
        System.out.println("Person Bean Created");
    }

    private String name="Lucy";


    /**
     * Represents an instance of a Vehicle object associated with the Person class.
     * Automatically injected by the Spring Framework using the @Autowired annotation.
     */
    @Autowired(required = false)
    private Vehicle vehicle;

//    You cannot use `final` with `@Autowired` for field injection because Spring uses reflection to inject the dependency after the object is created. However, `final` fields must be assigned during object creation, making the two incompatible



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

    
    public void setVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }

}
