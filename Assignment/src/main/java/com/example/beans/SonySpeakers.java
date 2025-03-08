package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speaker{
    @Override
    public String sound(){
       return "Sony speaker sound : 50dB";
    }
}
