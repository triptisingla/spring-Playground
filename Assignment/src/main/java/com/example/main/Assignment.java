package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.config.ProjectConfig;

public class Assignment {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        String[] persons= context.getBeanNamesForType(Person.class);
        Person person=context.getBean(Person.class);

        String[] vehicles= context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle=context.getBean(Vehicle.class);

        System.out.println("Person name 1 : "+person.getName());
        vehicle.getVehicleServices().moveVehicle();
        vehicle.getVehicleServices().playMusic();
//        person.getVehicle().getVehicleServices().moveVehicle();
//        person.getVehicle().getVehicleServices().playMusic();
        context.close();
    }
}
