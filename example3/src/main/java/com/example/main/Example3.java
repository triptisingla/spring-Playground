package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Example3 {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.setName("BMW");
        System.out.println("Name of vehicle without spring context is : "+vehicle.getName());



        @SuppressWarnings("resource")
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        /**
         * Returns an existing instance of the given bean name, if created earlier.
         * @param type the class of the object to return
         * @return an instance of the bean of the given type, never null
         * @throws NoSuchBeanDefinitionException if there is no such bean definition
         */

        
        /**
         * Return an instance, which may be shared or independent, of the specified bean.
         * @param name the name of the bean to return
         * @param requiredType the type the bean must match; can be an interface or superclass
         * @return an instance of the bean (never {@code null})
         * @throws NoSuchBeanDefinitionException if there is no such bean definition
         */
        var veh=context.getBean("AudiVehicle",Vehicle.class);
        System.out.println("Name of vehicle using spring context is : "+veh.getName());

        var veh1=context.getBean("PorcheVehicle",Vehicle.class);
        System.out.println("Name of vehicle using spring context is : "+veh1.getName());

        var veh2=context.getBean("MercedesVehicle",Vehicle.class);
        System.out.println("Name of vehicle using spring context is : "+veh2.getName());
    }
}
