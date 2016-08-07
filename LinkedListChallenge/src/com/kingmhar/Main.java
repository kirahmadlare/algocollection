package com.kingmhar;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
	// write your code here

        Album album = new Album("Stormbringer", "Deep purple");
        album.addSong("ffffff",4.6);
        album.addSong("xysdydy",5.6);
        album.addSong("ddddd",2.6);
        album.addSong("xxxx",3.6);
        album.addSong("asddadasd",2.1);
        album.addSong("You can't dp ot irgh",3.3);
        album.addSong("hig ball shooter",2.2);
        album.addSong("the gypsy",1.2);
        album.addSong("Soldier of fortune",2.6);

        album = new Album("For those about to rock","ACDC");
        album.addSong("qqqqqqq",2.2);
        album.addSong("sssssss",2.2);
        album.addSong("eeeeeee",3.2);
        album.addSong("yyyyyyy",4.4);
        album.addSong("pppppp",1.2);
        album.addSong("oooooo",2.5);
        album.addSong("EEeEEE",2.6);
        album.addSong("uuuuuu",3.1);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlatlist("You can't")






    }
}
