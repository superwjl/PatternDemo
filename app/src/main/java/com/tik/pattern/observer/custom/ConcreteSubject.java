package com.tik.pattern.observer.custom;


public class ConcreteSubject extends Subject {
    @Override
    public void doSomething() {
        System.out.println("FM001节目开始：");
        notifyObservers("我是FM001，欢迎收听");
    }
}
