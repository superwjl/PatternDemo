package com.tik.pattern.observer.custom;


public class ConcreteObserver2 implements Observer{
    @Override
    public void update(Subject subject, Object o) {
        System.out.println("观察者2收到信息，"+o);
        if(subject instanceof ConcreteSubject){
            System.out.println("观察者2：我不喜欢这个节目了，不听了");
            subject.removeObserver(this);
        }
    }
}
