package com.bassettmason.spring;

import javax.persistence.*;
import java.net.URL;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;
    String title;
    String artist;
    int songCount;
    int length;
    URL imageURL;


    public Album() {}

    public Album(String title,String artist, int songCount, int length, URL imageURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageURL = imageURL;
    }

    public String toString() {
        return title + artist + songCount + length + imageURL;
    }
}
