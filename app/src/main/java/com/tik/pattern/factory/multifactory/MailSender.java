package com.tik.pattern.factory.multifactory;

/**
 * 实现类
 */
public class MailSender implements ISender {
    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
