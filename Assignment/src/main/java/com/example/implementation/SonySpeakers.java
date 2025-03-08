package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SonySpeakers implements Speakers {

    @Override
    public String makeSound(){
        return "Sony speakers making Sound";
    }
}
