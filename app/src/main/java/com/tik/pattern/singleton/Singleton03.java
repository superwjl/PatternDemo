package com.tik.pattern.singleton;

/**
 * 使用一个持有类，主要是为了不在初始化的时候加载
 */
public class Singleton03 {

    /** 私有构造方法，防止被实例化 */
    private Singleton03() {
    }

    /** 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static Singleton03 instance = new Singleton03();
    }

    /** 获取实例 */
    public static Singleton03 getInstance(){
        return SingletonFactory.instance;
    }

    /** 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }

    protected void test(){
        System.out.println("i am singleton03.");
    }
}
