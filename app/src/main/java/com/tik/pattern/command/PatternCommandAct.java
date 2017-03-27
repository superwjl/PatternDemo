package com.tik.pattern.command;


import com.tik.pattern.BaseActivity;

public class PatternCommandAct extends BaseActivity {
    @Override
    protected String getPatternFileName() {
        return "command";
    }

    @Override
    protected void afterInitViews() {
        Door door = new Door();
        DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);
        DoorCloseCommand doorCloseCommand = new DoorCloseCommand(door);
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        System.out.println("执行一条命令 -->");
        Invoker invoker = new Invoker(doorOpenCommand);
        invoker.action();
        System.out.println("执行一组命令 -->");
        InvokerMulCommand invokerMulCommand = new InvokerMulCommand(new Command[]{
                doorOpenCommand, doorCloseCommand, lightOnCommand, lightOffCommand
        });
        invokerMulCommand.action();
    }
}
