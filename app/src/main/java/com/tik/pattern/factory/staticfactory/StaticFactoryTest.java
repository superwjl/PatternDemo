package com.tik.pattern.factory.staticfactory;


public class StaticFactoryTest {

    public static void test(){
        ISender sender = SendFactory.produceSms();
//        ISender sender = SendFactory.prouceMail();
        sender.send();
    }
}
