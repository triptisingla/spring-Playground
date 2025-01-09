package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.beans.Vehicle;

@Configuration
public class ProjectConfig {


    @Bean
    @Primary
    Vehicle vehicle1(){
        var veh=new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        var veh=new Vehicle();
        veh.setName("Mercedes");
        return veh;
    }@Bean
    Vehicle vehicle3(){
        var veh=new Vehicle();
        veh.setName("Porche");
        return veh;
    }

}
