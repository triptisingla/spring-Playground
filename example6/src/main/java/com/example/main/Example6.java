package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Example6 {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        System.out.println("Name of vehicle without spring context is : " + vehicle.getName());

        @SuppressWarnings("resource")
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /**
         * Returns an existing instance of the given bean name, if created earlier.
         * 
         * @param type the class of the object to return
         * @return an instance of the bean of the given type, never null
         * @throws NoSuchBeanDefinitionException if there is no such bean definition
         */

        var veh = context.getBean(Vehicle.class);
        // veh.setName("Audi");
        System.out.println(veh.getName());
        veh.helloWorld();

        context.close();
    }
}
