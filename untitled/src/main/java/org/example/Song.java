package org.example;

public class Song implements BroadcastType {
    String name;
    int duration;
    int price;
    public Song (String name, int duration){
        this.name = name;
        this.duration = duration;
    }
    @Override
    public String name() {
        return name;
    }

    @Override
    public int duration() {
        return duration;
    }

    @Override
    public int price() {
        price = 0;
        return price;
    }
}
