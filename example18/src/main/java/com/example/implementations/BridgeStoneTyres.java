package com.example.implementations;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate(){
        return "BridgeStone tyres moving the vehicle";
    }

    @Override
    public String stop(){
        return "Vehicle has been stopped by Bridgestone tyres";
    }
}
