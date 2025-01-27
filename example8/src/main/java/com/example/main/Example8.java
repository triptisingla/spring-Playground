package com.example.main;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.beans.Vehicle;

public class Example8 {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        var context = new ClassPathXmlApplicationContext("beans.xml");

        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println(veh.getPrice());
        context.close();
    }
}
