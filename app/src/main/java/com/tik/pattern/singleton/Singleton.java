package com.tik.pattern.singleton;

/**
 * 恶汉式
 */
public class Singleton {

    private static Singleton intance = new Singleton();

    /** 私有构造方法，防止被实例化 */
    private Singleton() {

    }

    public static Singleton getIntance(){
        return intance;
    }

    protected void test(){
        System.out.println("i am singleton.");
    }
}
