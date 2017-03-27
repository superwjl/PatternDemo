package com.tik.pattern.observer.custom;

public class ConcreteObserver1 implements Observer{

    @Override
    public void update(Subject subject, Object o) {
        System.out.println("观察者1收到信息，"+o);
    }
}
