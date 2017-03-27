package com.tik.pattern.adapter.adapter4class;



public class AdapterForClass extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
