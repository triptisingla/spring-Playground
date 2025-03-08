package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speaker{
    @Override
    public String sound(){
        return "Bose speaker sound : 100dB";
    }
}
