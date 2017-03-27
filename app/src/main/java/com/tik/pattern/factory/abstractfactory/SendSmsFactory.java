package com.tik.pattern.factory.abstractfactory;


public class SendSmsFactory implements IProvider {
    @Override
    public ISender produce() {
        return new SmsSender();
    }
}
