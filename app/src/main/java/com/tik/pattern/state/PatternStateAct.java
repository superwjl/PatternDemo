package com.tik.pattern.state;


import com.tik.pattern.BaseActivity;

public class PatternStateAct extends BaseActivity{
    @Override
    protected String getPatternFileName() {
        return "state";
    }

    @Override
    protected void afterInitViews() {
        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
