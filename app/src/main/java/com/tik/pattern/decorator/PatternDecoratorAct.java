package com.tik.pattern.decorator;

import com.tik.pattern.BaseActivity;


public class PatternDecoratorAct extends BaseActivity {
    @Override
    protected String getPatternFileName() {
        return "decorator";
    }

    @Override
    protected void afterInitViews() {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
