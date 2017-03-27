package com.tik.pattern.factory.multifactory;


public class MultiFactoryTest {

    public static void test(){
        SendFactory factory = new SendFactory();
        ISender sender = factory.produceSms();
//        ISender sender = factory.prouceMail();
        sender.send();
    }
}
