package com.tik.pattern.singleton;

/**
 * 懒汉式双重检验锁
 * 懒汉式变种，属于懒汉式中最好的写法，保证了：延迟加载和线程安全
 */
public class Singleton02 {

    /** 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton02 instance = null;

    /** 私有构造方法，防止被实例化 */
    private Singleton02() {

    }

    /** 静态工程方法，创建实例 */
    public static Singleton02 getInstance(){
        if(instance == null){
            synchronized (Singleton02.class){
                if(instance == null){
                    instance = new Singleton02();
                }
            }
        }
        return instance;
    }

    /** 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }

    protected void test(){
        System.out.println("i am singleton02.");
    }
}
