package com.example.config;

import com.example.beans.SpeakerClass;
import com.example.beans.TyreClass;
import org.springframework.context.annotation.*;

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
@ComponentScan("com.example.beans")
public class ProjectConfig {

    /**
     * Creates and returns a Vehicle bean with the name set to "Audi".
     *
     * @return a Vehicle object with its name property set to "Audi"
     */
    @Bean
    Vehicle vehicle1(){
        var veh=new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    /**
     * Creates and configures a Vehicle bean with the name "Honda".
     *
     * @return a Vehicle instance with its name set to "Honda"
     */
    @Bean
    Vehicle vehicle2(){
        var veh=new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    /**
     * Creates and returns a Vehicle bean with its name set to "Ferrari".
     * This bean is marked as the primary bean for the Vehicle type.
     *
     * @return a Vehicle instance with the name "Ferrari"
     */
//    @Primary
    @Bean
    Vehicle vehicle3(){
        var veh=new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    @Bean
    TyreClass BridgeStoneTyres(){
        var tyre=new TyreClass();
        tyre.setmodel("BridgeStone");
        return tyre;
    }

    @Primary
    @Bean
    TyreClass MichelinTyres(){
        var tyre=new TyreClass();
        tyre.setmodel("Michelin");
        return tyre;
    }


    @Bean
    SpeakerClass SonySpeakers(){
        var speaker=new SpeakerClass();
        speaker.setCompany("Sony");
        return speaker;
    }

    @Primary
    @Bean
    SpeakerClass BoseSpeakers(){
        var speaker=new SpeakerClass();
        speaker.setCompany("Bose");
        return speaker;
    }
}


//1. In the constructor, the parameter name matches the bean name, but this is removed from JAVA 6.1
//2. Add @Primary annotation to one of the bean, so when a bean of name is not found, the primary bean is injected
//3. Pass @Qualifier annotation with the bean name in brackets in Person class constructor, with any name for the parameter (best and mostly followed)

