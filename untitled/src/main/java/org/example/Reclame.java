package org.example;

public class Reclame implements BroadcastType {
    private String name;
    private int duration;
    private int recPrice = 5;// цена 1с рекламы
    private int price;
    public Reclame(String name, int duration) {
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
        price = 60*recPrice*this.duration;//Для простоты вычислений будем задавать рекламу в минутах
        return price;
    }
}
