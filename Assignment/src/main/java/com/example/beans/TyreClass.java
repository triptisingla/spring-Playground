package com.example.beans;

public class TyreClass implements Tyre {
    private String model;

    public void setmodel(String model){
        this.model=model;
    }
    @Override
    public String speed() {
        return model+" is fast speed";
    }
}
