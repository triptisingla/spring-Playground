package com.example.main;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Example9 {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        var person=context.getBean(Person.class);
        var vehicle=context.getBean(Vehicle.class);

        System.out.println("Person name : "+person.getName());
        System.out.println("Vehicle name : "+vehicle.getName());
        System.out.println("Person's vehicle name : "+person.getVehicle());

        context.close();
    }
}