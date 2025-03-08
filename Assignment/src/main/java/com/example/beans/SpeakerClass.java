package com.example.beans;

interface Speaker{
    String sound();
}
//@Component
public class SpeakerClass implements Speaker {

    private String company;

    @Override
    public String sound(){
        return company+" speaker sound";
    }

    public void setCompany(String company){
        this.company=company;
    }
}
