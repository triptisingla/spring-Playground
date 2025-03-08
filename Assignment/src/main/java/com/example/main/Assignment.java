package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.config.ProjectConfig;

public class Assignment {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        var person=context.getBean(Person.class);

        System.out.println("Person name 1 : "+person.getName());
//        System.out.println("Person's vehicle name 1 : "+person.getVehicle());
        person.getVehicle().getVehicleServices().moveVehicle();
        person.getVehicle().getVehicleServices().playMusic();
        context.close();
    }
}
