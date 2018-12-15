package com.bassettmason.spring;

import javax.persistence.*;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;
    String title;
    String artist;
    int songCount;
    int length;
    String imageURL;

    
    @ManyToOne
    public Location location;

    public Album() {}

    public Album(String title,String artist, int songCount, int length, String imageURL) {
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
