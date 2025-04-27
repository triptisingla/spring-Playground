package com.example.implementations;

import com.example.classes.Song;
import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    public String makeSound(Song song){
        return "Bose speakers playing song: title = "+song.getTitle()+" by singer = "+song.getSingerName();
    }
}
