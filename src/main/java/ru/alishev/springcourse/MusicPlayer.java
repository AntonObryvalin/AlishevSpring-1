package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic)
    {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(EnumMusic enumMusic) {
        Random rand = new Random();
        int randomNum = rand.nextInt(3);

        if(enumMusic == EnumMusic.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNum));
        } else {
            System.out.println(rockMusic.getSongs().get(randomNum));
        }

    }
}
