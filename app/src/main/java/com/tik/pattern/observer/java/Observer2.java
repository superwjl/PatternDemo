package com.tik.pattern.observer.java;

import java.util.Observable;
import java.util.Observer;


public class Observer2 implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        System.out.println("observer2收到信息："+o);
    }
}
