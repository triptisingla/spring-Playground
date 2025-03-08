package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired
    public TyreClass tyre;

    @Autowired
    public BoseSpeakers speaker;

    public String playSound(){
        return speaker.sound();
    }


    public String isSpeed(){
        return tyre.speed();
    }
}
