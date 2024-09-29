package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();


    {
        songs.add("Rock1");
        songs.add("Rock2");
        songs.add("Rock3");
    }


    @Override
    public List<String> getSongs() {
        return songs;
    }
}
