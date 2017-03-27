package com.tik.pattern.observer.custom;


public class ConcreteSubject2 extends Subject{
    @Override
    public void doSomething() {
        System.out.println("FM002节目开始：");
        notifyObservers("我是FM002，欢迎收听");
    }
}
