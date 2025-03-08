package com.example.beans;

import com.example.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
public class Vehicle {

    private String name="Toyota";
    private VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        System.out.println("Vehicle Bean Created");
        this.vehicleServices=vehicleServices;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void helloWorld() {
        System.out.println("Hello World");
    }

//    @Override
//    public String toString() {
//        return "Vehicle [name=" + name + " \n sound = "+vehicleServices.speaker.makeSound()+" \n Speed = "+vehicleServices.tyre.rotate()+"]";
//
//    }
    public VehicleServices getVehicleServices(){
        return vehicleServices;
    }


}
