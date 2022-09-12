package org.example;

public class Creator {

    public Song createSong(String executor, String song, int time){
        String s = executor + " - " + song;
        return new Song(s,time);
    }
    public Interview crateInterview(String presenter, int time){
    return new Interview(presenter, time);
           }
    public Reclame createReclame(String name, int time){
        return new Reclame(name, time);
    }
}
