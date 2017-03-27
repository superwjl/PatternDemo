package com.tik.pattern.factory.staticfactory;

/**
 * 工厂类
 */
public class SendFactory {

    public static ISender prouceMail(){
        return new MailSender();
    }

    public static ISender produceSms(){
        return new SmsSender();
    }
}
