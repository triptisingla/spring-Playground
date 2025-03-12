package com.example.implementations;

import com.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoatSpeakers implements Speakers {
    public String makeSound(){
        return "Boat speakers playing music";
    }
}
