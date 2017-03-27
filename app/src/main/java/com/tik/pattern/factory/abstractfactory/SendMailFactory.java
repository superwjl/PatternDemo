package com.tik.pattern.factory.abstractfactory;


public class SendMailFactory implements IProvider {
    @Override
    public ISender produce() {
        return new MailSender();
    }
}
