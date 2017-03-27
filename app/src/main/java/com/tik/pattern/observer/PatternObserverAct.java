package com.tik.pattern.observer;

import com.tik.pattern.BaseActivity;
import com.tik.pattern.observer.custom.ConcreteObserver1;
import com.tik.pattern.observer.custom.ConcreteObserver2;
import com.tik.pattern.observer.custom.ConcreteSubject;
import com.tik.pattern.observer.custom.ConcreteSubject2;
import com.tik.pattern.observer.custom.Subject;
import com.tik.pattern.observer.java.Observer1;
import com.tik.pattern.observer.java.Observer2;
import com.tik.pattern.observer.java.SubjectForWeatherReport;


public class PatternObserverAct extends BaseActivity {

    @Override
    protected String getPatternFileName() {
        return "observer";
    }

    @Override
    protected void afterInitViews() {
        /**
         * 自定义观察者模式
         */
        Subject sub1 = new ConcreteSubject();
        sub1.registerObserver(new ConcreteObserver1());
        sub1.registerObserver(new ConcreteObserver2());
        Subject sub2 = new ConcreteSubject2();
        sub2.registerObserver(new ConcreteObserver1());
        sub2.registerObserver(new ConcreteObserver2());
        sub1.doSomething();
        sub1.doSomething();
        sub2.doSomething();
        sub2.doSomething();

        System.out.println("=======================");

        /**
         * 使用Java内置的类实现观察者模式
         */
        SubjectForWeatherReport subject = new SubjectForWeatherReport();
        subject.addObserver(new Observer1());
        subject.addObserver(new Observer2());
        subject.doSomething();
    }

}
