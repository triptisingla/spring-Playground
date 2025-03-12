package com.example.main;

import com.example.Services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.config.ProjectConfig;

public class Example16 {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before creating bean");
        var person=context.getBean(Person.class);

        System.out.println("Person name 1 : "+person.getName());

        VehicleServices vehicleServices1=context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2=context.getBean("vehicleServices",VehicleServices.class);

        System.out.println(vehicleServices1.hashCode());
        System.out.println(vehicleServices2.hashCode());


        context.close();
    }
}
