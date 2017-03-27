package com.tik.pattern.observer.custom;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 主题接口，所有的主题必须实现此接口
 */
public abstract class Subject {

    private Vector<Observer> observers = new Vector<>();

    /**
     * 注册一个观察者
     * @param observer
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    };

    /**
     * 移除一个观察者
     * @param observer
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }


    /**
     * 通知所有观察者
     */
    protected void notifyObservers(Object o){
//        for (Observer observer : observers){
//            observer.update(this, o);
//        }
        Enumeration<Observer> enums = observers.elements();
        while (enums.hasMoreElements()){
            enums.nextElement().update(this, o);
        }
    }

    /**
     * 自身的操作
     */
    public abstract void doSomething();
}
