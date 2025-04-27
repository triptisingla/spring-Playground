package com.example.implementations;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {
    @Override
    public String rotate(){
        return "Michelin tyres moving the vehicle";
    }

    @Override
    public String stop(){
        return "Vehicle has been stopped by Michellin tyres";
    }
}
