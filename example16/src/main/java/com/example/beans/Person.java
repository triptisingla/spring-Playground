package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("personBean")
@Lazy
public class Person {

    private String name="Lucy";
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
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
}


//Eager instantiation
//1. This is the default behavior inside Spring framework
//2. The singleton bean will be created during the startup of the application
//3. The server will not start if bean is not able to create due to any dependent exceptions
//4. Spring context will occupy lot of memory if we try to use eager for all beans inside a application
//5. Eager can be followed for all the beans which are required very commonly inside a application


//| Lazy instantiation |
//1. This is not a default behavior and need to configure explicitly using @Lazy
//2. The singleton bean will be created when the app is trying to refer the bean for the first time
//3. Application will throw an exception runtime if bean creation is failed due to any dependent exceptions
//4. The performance will be impacted if we try to use lazy for all beans inside a application
//5. Lazy can be followed for the beans that are used in a very remote scenario inside a application