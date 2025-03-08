package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

//    @Autowired
    public TyreClass tyre;

//    @Autowired
    public SpeakerClass speaker;

    @Autowired
    public  VehicleServices(@Qualifier("MichelinTyres") TyreClass tyre, @Qualifier("SonySpeakers") SpeakerClass speaker){
        this.tyre=tyre;
        this.speaker=speaker;
    }

    public String playSound(){
        return speaker.sound();
    }


    public String isSpeed(){
        return tyre.speed();
    }
}
