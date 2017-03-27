package com.tik.pattern.factory.simplefactory;


public class SimpleFactoryTest {

    public static void test(){
        SendFactory factory = new SendFactory();
        ISender sender = factory.produce("sms");
//        ISender sender = factory.produce("mail");
        sender.send();
    }
}
