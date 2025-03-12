package com.example.main;

import com.example.Services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.config.ProjectConfig;

public class Example17 {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleServices vehicleServices1=context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2=context.getBean("vehicleServices",VehicleServices.class);

        System.out.println(vehicleServices1.hashCode());
        System.out.println(vehicleServices2.hashCode());

        if(vehicleServices1==vehicleServices2)
            System.out.println("Singleton");
        else
            System.out.println("Prototype");

        context.close();
    }
}

/**
 * The vehicleServices bean is created 3 time even when i call it 2 times explicitly
 * bcz 1 time it is created by vehicle bean. inside which I am autowiring it. Vehicle bean is singleton, so no matter how many times I inject it inside it, it will have only 1 instance of VehicleService bean
 * */