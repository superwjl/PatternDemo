package com.tik.pattern.factory.simplefactory;

/**
 * 实现类
 */
public class SmsSender implements ISender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
