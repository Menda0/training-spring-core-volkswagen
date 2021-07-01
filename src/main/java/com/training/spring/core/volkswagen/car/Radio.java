package com.training.spring.core.volkswagen.car;

import java.util.List;

public class Radio {

    private List<String> songs;

    public void playSong() {
        System.out.println("The song "+songs[0]+" is playing");
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
