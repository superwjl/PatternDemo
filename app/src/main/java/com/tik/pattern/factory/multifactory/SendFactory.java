package com.tik.pattern.factory.multifactory;

/**
 * 工厂类
 */
public class SendFactory {

    public ISender prouceMail(){
        return new MailSender();
    }

    public ISender produceSms(){
        return new SmsSender();
    }
}
