package com.example.Services;

import com.example.classes.Song;
import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleServices {

    private Logger logger= Logger.getLogger(VehicleServices.class.getName());

    @Autowired
    public Speakers speakers;
    @Autowired
    public Tyres tyres;

    public VehicleServices()
    {
        System.out.println("creating vehicle services bean");
    }



    public String playMusic(boolean vehicleStarted, Song song){
//        Instant start=Instant.now();
//
//        logger.info("method execution started");
//        String music=null;
//        if(vehicleStarted)
//        {
//            music=speakers.makeSound(song);
//        }
//        else{
//            logger.log(Level.SEVERE,"vehicle not started to play music");
//        }
//        logger.info("method execution end");
//        Instant finish=Instant.now();
//        long timeElapsed= Duration.between(start,finish).toMillis();
//        logger.info("Time took to execute the function "+timeElapsed);
        return speakers.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted){
//        Instant start=Instant.now();
//        logger.info("Method execution started");
//        String status=null;
//
//        if(vehicleStarted)
//        {
//            status=tyres.rotate();
//        }
//        else {
//            logger.log(Level.SEVERE,"Vehicle not started to move vehicle");
//        }
//        logger.info("Method execution end");
//        Instant finish=Instant.now();
//        long timeElapsed= Duration.between(start,finish).toMillis();
//        logger.info("Time took to execute the function "+timeElapsed);

//        throw new RuntimeException("ohh!! encountered an exception");
        return tyres.rotate();
    }

    public String applyBrakes(boolean vehicleStarted){
//        Instant start=Instant.now();
//        logger.info("Method execution started");
//        String status=null;
//
//        if(vehicleStarted)
//        {
//            status=tyres.stop();
//        }
//        else {
//            logger.log(Level.SEVERE,"Vehicle not started to stop vehicle");
//        }
//        logger.info("Method execution end");
//        Instant finish=Instant.now();
//        long timeElapsed= Duration.between(start,finish).toMillis();
//        logger.info("Time took to execute the function "+timeElapsed);
        return tyres.stop();
    }
}
