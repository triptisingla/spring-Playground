package com.example.main;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Example7 {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen=new Vehicle();
        volkswagen.setName("Volkswagen GTI");
        
        Supplier<Vehicle> VolksSupplier=()->volkswagen;
        
        Supplier<Vehicle> AudiSupplier=()->{
            Vehicle audi=new Vehicle();
            audi.setName("Audi 8");
            return audi;
        };

        Random random=new Random();
        int num=random.nextInt(1,10);
        System.out.println("Number : "+num);

        Vehicle volksVehicle=null;
        Vehicle audiVehicle=null;

        if(num%2==0){
            context.registerBean("volkswagen",Vehicle.class,VolksSupplier);
        }else{
            context.registerBean("audi",Vehicle.class,AudiSupplier);
        }

        try{
            volksVehicle=context.getBean("volkswagen",Vehicle.class);
        }
        catch(NoSuchBeanDefinitionException e){
            System.out.println("Volkswagen Bean not found");
        }

        try{
            audiVehicle=context.getBean("audi",Vehicle.class);
        }
        catch(NoSuchBeanDefinitionException e){
            System.out.println("Audi Bean not found");
        }

        if(volksVehicle!=null){
            System.out.println("Name of vehicle using spring context is : "+volksVehicle.getName());
        }
        else{
            System.out.println("Name of vehicle using spring context is : "+audiVehicle.getName());
        }
        context.close();
    }
}
