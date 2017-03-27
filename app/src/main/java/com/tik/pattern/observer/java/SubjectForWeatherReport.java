package com.tik.pattern.observer.java;


import java.util.Observable;


public class SubjectForWeatherReport extends Observable{


    public void doSomething(){
        setChanged();
        notifyObservers("今天天气不错");
    }
}
