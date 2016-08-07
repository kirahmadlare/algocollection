package com.kingmhar;

/**
 * Created by Kingmhar on 7/16/16.
 */
public class Song {
    private String name;
    private double duration;

    public Song(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return this.name + ": " + this.duration;
    }
}
