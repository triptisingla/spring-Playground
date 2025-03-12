package com.example.Services;

import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleServices {

    public Speakers speakers;
    public Tyres tyres;

    @Autowired
    public VehicleServices(Speakers speakers, Tyres tyres)
    {
        System.out.println("creating vehicleservices bean");
        this.tyres=tyres;
        this.speakers=speakers;
    }

    public void playMusic(){
        System.out.println(speakers.makeSound());
    }

    public void moveVehicle(){
        System.out.println(tyres.rotate());
    }
}
