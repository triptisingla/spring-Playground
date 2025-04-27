package com.example.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.example.implementations","com.example.Services","com.example.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}


//1. In the constructor, the parameter name matches the bean name, but this is removed from JAVA 6.1
//2. Add @Primary annotation to one of the bean, so when a bean of name is not found, the primary bean is injected
//3. Pass @Qualifier annotation with the bean name in brackets in Person class constructor, with any name for the parameter (best and mostly followed)

