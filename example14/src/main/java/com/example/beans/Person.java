package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    /**
     * Constructs a Person object and injects the specified Vehicle dependency.
     *
     * @param vehicle the Vehicle object to be associated with this Person
     * Can use final here, production purpose
     */
    private String name="Lucy";
    private Vehicle vehicle;

//    The `@Qualifier` annotation in Spring is used to resolve the issue of ambiguity when multiple beans of the same type are available in the application context. In other words, it helps specify which bean should be injected when there are multiple candidates for dependency injection.

//    - When a type (e.g., `Vehicle`) has multiple bean implementations defined in the Spring container, the `@Qualifier` annotation allows you to specify **which particular bean** should be chosen for injection.
//    - The value provided to `@Qualifier` should match the name of a bean (or the value of the `@Component`'s "name" property).

    /**
     * Constructs a Person object and injects the specified Vehicle dependency.
     *
     * @param vehicle the Vehicle object to be injected into this Person instance
     */
    @Autowired
    public Person(@Qualifier("vehicle2") Vehicle vehicle) {
        System.out.println("Person Bean Created");
        this.vehicle=vehicle;
    }




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
