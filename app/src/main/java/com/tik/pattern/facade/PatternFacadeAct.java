package com.tik.pattern.facade;


import com.tik.pattern.BaseActivity;

public class PatternFacadeAct extends BaseActivity {
    @Override
    protected String getPatternFileName() {
        return "facade";
    }

    @Override
    protected void afterInitViews() {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
