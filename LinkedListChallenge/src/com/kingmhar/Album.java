package com.kingmhar;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Kingmhar on 7/16/16.
 */
public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration)
    {
        if(findSong(title) == null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title)
    {
        for (Song checkedSong: this.songs)
        {
            if(checkedSong.getName().equals(title)){
                return checkedSong;
            }
        }

        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList)
    {
        int index = trackNumber - 1;
        if((index>0) && (index <= this.songs.size()))
        {
            playList.add(this.songs.get(index));
            return true;
        }

        System.out.println("This album does not have a track");
        return false;
    }

    public boolean addToPlatlist(String title, LinkedList<Song> playlist)
    {
        Song checkedSong = findSong(title);

        if(checkedSong != null){
            playlist.add(checkedSong);
        return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }









}
