package com.example.services;
import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    public Tyres tyre;

    @Autowired
    public Speakers speaker;


    public void playMusic(){
        String music=speaker.makeSound();
        System.out.println(music);
    }


    public void moveVehicle(){
        String status= tyre.rotate();
        System.out.println(status);
    }

    @Autowired
    public void setTyre(Tyres tyre){
        this.tyre=tyre;
    }

}

