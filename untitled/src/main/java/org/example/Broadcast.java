package org.example;

import java.util.ArrayList;

public class Broadcast{
    int timePaidBroadcast = 0;
    int broadcastTime;
    int broadcastСost;
    ArrayList<BroadcastType> list;

    public Broadcast(ArrayList<BroadcastType> list, int broadcastTime) {
        this.list = list;
        this.broadcastTime = broadcastTime;
    }
    public void isCorrect(){
        int time= 0;
        for (BroadcastType type : list) {
            time += type.duration();
            if (type.price() != 0) {
                timePaidBroadcast += type.duration();
            }
                    }
        System.out.println("sum" + time);
        System.out.println("paid" + timePaidBroadcast);
        //проверка корректности продолжительности трансляции
        if (broadcastTime < time){
            throw new RuntimeException("invalid duration!!!!");
        }
        //проверяем, чтобы платная часть трансляции не привышала половины времени всей трансляции
        else if (broadcastTime/2 < timePaidBroadcast){
            throw new RuntimeException("invalid duration of the paid part!!!!");
        }
    }
    public int broadcastСost(){

        for (BroadcastType type : list) {
            broadcastСost += type.price();
        }
        System.out.println("broadcastСost = " + broadcastСost + " €");
        return broadcastСost;

    }

    @Override
    public String toString() {
        String str = "";
        for (BroadcastType type : list) {
            str += "\n" + "name " + type.name() + "; duration - " +
             type.duration() + " min; price = " + type.price() + " €" ;
        }
        return  "timePaidBroadcast=" + timePaidBroadcast +
                " min, broadcastTime=" + broadcastTime +
                " min, broadcastСost=" + broadcastСost + " €" + "\n" +
                " list: " + str;

    }

}
