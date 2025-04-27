package com.example.implementations;

import com.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import com.example.classes.Song;

@Component
@Primary
public class BoatSpeakers implements Speakers {
    public String makeSound(Song song) {
        return "Boat speakers playing : title = " + song.getTitle() + " by singer = " + song.getSingerName();
    }
}
