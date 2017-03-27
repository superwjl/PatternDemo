package com.tik.pattern.adapter.adapter4object;



public class Wrapper implements Targetable2 {
    private Source2 source2;

    public Wrapper(Source2 source2) {
        this.source2 = source2;
    }

    @Override
    public void method1() {
        source2.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
