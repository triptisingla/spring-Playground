package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Example1 {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.setName("BMW");
        System.out.println("Name of vehicle without spring context is : "+vehicle.getName());



        @SuppressWarnings("resource")
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        var veh=context.getBean(Vehicle.class);
        System.out.println("Name of vehicle using spring context is : "+veh.getName());

        var str=context.getBean(String.class);
        System.out.println("Name of String using spring context is : "+str);

        var val=context.getBean(Integer.class);
        System.out.println("Name of value using spring context is : "+val);
    }
}
