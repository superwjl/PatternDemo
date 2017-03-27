package com.tik.pattern.strategy;


import com.tik.pattern.BaseActivity;


public class PatternStrategyAct extends BaseActivity {

    @Override
    protected String getPatternFileName() {
        return "strategy";
    }

    @Override
    protected void afterInitViews() {
        String exp = "2+8";
        String exp2 = "5-2";
        String exp3 = "2*3";

        ICalculator cal = new Plus();
        System.out.println(exp+"="+cal.calculate(exp));

        cal = new Minus();
        System.out.println(exp2+"="+cal.calculate(exp2));

        cal = new Multiply();
        System.out.println(exp3+"="+cal.calculate(exp3));
    }

}
