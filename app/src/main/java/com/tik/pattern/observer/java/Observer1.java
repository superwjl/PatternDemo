package com.tik.pattern.observer.java;


import java.util.Observable;
import java.util.Observer;

public class Observer1 implements Observer{

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("observer1收到信息："+o);
    }
}
