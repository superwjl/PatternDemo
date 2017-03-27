package com.tik.pattern.command;


public class InvokerMulCommand {

    private Command[] commands;

    public InvokerMulCommand(Command[] commands) {
        this.commands = commands;
    }

    public void action(){
        for (int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }
}
