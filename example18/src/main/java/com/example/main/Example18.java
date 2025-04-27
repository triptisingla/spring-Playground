package com.example.main;

import com.example.Services.VehicleServices;
import com.example.classes.Song;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.ProjectConfig;

public class Example18 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices=context.getBean(VehicleServices.class);
        System.out.println(vehicleServices.getClass());
        Song song=new Song();
        song.setTitle("Criminal");
        song.setSingerName("Britney Spears");
        boolean vehicleStarted=true;
        String playMusic=vehicleServices.playMusic(vehicleStarted,song);
        String moving=vehicleServices.moveVehicle(vehicleStarted);
        String stopping=vehicleServices.applyBrakes(vehicleStarted);

        context.close();
    }
}

