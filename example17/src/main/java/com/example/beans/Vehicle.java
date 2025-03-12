package com.example.beans;

import com.example.Services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    @Autowired
    public VehicleServices vehicleServices;

    public Vehicle() {
        System.out.println("Vehicle Bean Created");
    }

    private String name="Toyota";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public void helloWorld() {
        System.out.println("Hello World");
    }

    @Override
    public String toString() {
        return "Vehicle [name=" + name + "]";
    }


}
