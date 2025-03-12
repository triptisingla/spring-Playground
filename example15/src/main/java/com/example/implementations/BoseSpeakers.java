package com.example.implementations;

import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    public String makeSound(){
        return "Bose speakers playing music";
    }
}
