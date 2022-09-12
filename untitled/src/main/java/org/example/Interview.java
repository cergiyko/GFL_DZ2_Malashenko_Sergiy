package org.example;

public class Interview implements BroadcastType{
    String name;
    int duration;
    int interPrice = 30; //Стоимость 1мин интервью
    int price;

    public Interview(String presenter, int duration) {
        this.duration = duration;
        name = presenter;
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
        price = duration*interPrice;
        return price;
    }
}
