package com.tik.pattern.factory.abstractfactory;


public class AbstractFactoryTest {

    public static void test(){
        IProvider provider = new SendSmsFactory();
        ISender sender = provider.produce();
        sender.send();
    }
}
