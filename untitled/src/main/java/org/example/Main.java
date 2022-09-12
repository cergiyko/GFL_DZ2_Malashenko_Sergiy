package org.example;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
//Для создания экземпляров песен, интервью и рекламмы
// буду использовать "Абстрактную фабрику" - BroadcastType
// и класс Creator с методами для создания конкретных объектов

        Creator creator = new Creator();

        ArrayList <BroadcastType> list = new ArrayList<>();
        //Песни
        list.add(creator.createSong("Sting", "Fragine", 6));
        list.add(creator.createSong("Sting", "DesertRose", 5));
        list.add(creator.createSong("Sting", "DesertRose", 5));
        list.add(creator.createSong("Scorpions", "YouAndI", 6));
        list.add(creator.createSong("Scorpions", "MaybeIMaybeYou", 4));
        list.add(creator.createSong("Scorpions", "YouAndI", 7));
        list.add(creator.createSong("Scorpions", "MaybeIMaybeYou", 6));
        list.add(creator.createSong("Metallica", "TheUnforgiven", 4));
        list.add(creator.createSong("Metallica", "NothingElseMatters", 6));
        list.add(creator.createSong("Metallica", "EnterSandman", 8));
        list.add(creator.createSong("Metallica", "FadeToBlack", 5));
        //Интервью
        list.add(creator.crateInterview("LarryKing",10));
        list.add(creator.crateInterview("OprahWinfrey",12));
        list.add(creator.crateInterview("CraigFerguson",10));
        list.add(creator.crateInterview("DavidLetterman",12));
        list.add(creator.crateInterview("UriyDud",10));
        //Реклама
        list.add(creator.createReclame("Fanta", 1));
        list.add(creator.createReclame("CocaCola", 1));
        list.add(creator.createReclame("Sprite", 1));
        list.add(creator.createReclame("Mirinda", 1));
    //Используя структурный паттерн "Компоновщик" создаю класс Broadcast
    //в котором работаю с трансляцией

        Broadcast broadcast1 = new Broadcast( list ,120);
        broadcast1.isCorrect();
        broadcast1.broadcastСost();
        System.out.println(broadcast1.toString());
        writer(broadcast1.toString());
    }
    private static void writer(String str){
        try(PrintWriter out = new PrintWriter("file.txt")){
            out.println(str); }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    }






