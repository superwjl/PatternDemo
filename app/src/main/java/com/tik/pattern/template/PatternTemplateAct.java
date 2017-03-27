package com.tik.pattern.template;


import com.tik.pattern.BaseActivity;

public class PatternTemplateAct extends BaseActivity{
    @Override
    protected String getPatternFileName() {
        return "template";
    }

    @Override
    protected void afterInitViews() {
        String exp = "1+2";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(exp+"="+result);
    }
}
