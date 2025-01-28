package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.beans.Person;
import com.example.beans.Vehicle;

@Configuration
/**
 * @ComponentScan("com.example.beans") : This annotation is used to
 *                                       automatically pick up all the
 *                                       spring components from the
 *                                       beans package and register them
 *                                       in the spring's application
 *                                       context.
 */
public class ProjectConfig {
   
    /**
     * Creates and configures a Person bean.
     * 
     * @return a Person object with a name and associated vehicle
     * Assign a vehicle to the person by calling the function that is annotated with @bean annotation.
     */
    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle);
        return person;
    }

    
    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle=new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }

}