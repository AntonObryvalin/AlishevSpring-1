package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("RAPSODY1");
        songs.add("RAPSODY2");
        songs.add("RAPSODY3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
