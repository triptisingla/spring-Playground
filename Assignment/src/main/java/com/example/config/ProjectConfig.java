package com.example.config;

import org.springframework.context.annotation.*;

@Configuration
/**
 * @ComponentScan("com.example.beans") : This annotation is used to
 *                                       automatically pick up all the
 *                                       spring components from the
 *                                       beans package and register them
 *                                       in the spring's application
 *                                       context.
 */
@ComponentScan(basePackages = {"com.example.implementation","com.example.services"})
@ComponentScan(basePackageClasses = {com.example.beans.Vehicle.class,com.example.beans.Person.class})
public class ProjectConfig {

}


//1. In the constructor, the parameter name matches the bean name, but this is removed from JAVA 6.1
//2. Add @Primary annotation to one of the bean, so when a bean of name is not found, the primary bean is injected
//3. Pass @Qualifier annotation with the bean name in brackets in Person class constructor, with any name for the parameter (best and mostly followed)

