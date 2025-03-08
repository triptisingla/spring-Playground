package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle Bean Created");
    }

    private String name="Toyota";

    public String getName() {
        return name;
    }

    @Autowired
    public VehicleServices vehServ;

    public void setName(String name) {
        this.name = name;
    }

    public void helloWorld() {
        System.out.println("Hello World");
    }

    @Override
    public String toString() {
        return "Vehicle [name=" + name + " \n sound = "+vehServ.playSound()+" \n Speed = "+vehServ.isSpeed()+"]";

    }


}
