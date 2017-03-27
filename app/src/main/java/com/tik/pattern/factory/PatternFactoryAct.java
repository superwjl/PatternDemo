package com.tik.pattern.factory;


import com.tik.pattern.BaseActivity;
import com.tik.pattern.factory.abstractfactory.AbstractFactoryTest;
import com.tik.pattern.factory.multifactory.MultiFactoryTest;
import com.tik.pattern.factory.simplefactory.SimpleFactoryTest;
import com.tik.pattern.factory.staticfactory.StaticFactoryTest;

/**
 * 工厂模式
 */
public class PatternFactoryAct extends BaseActivity {
    @Override
    protected String getPatternFileName() {
        return "factory";
    }

    @Override
    protected void afterInitViews() {
        /** 工厂方法模式 - 普通工厂模式 */
        SimpleFactoryTest.test();
        /** 工厂方法模式 - 多工厂模式 */
        MultiFactoryTest.test();
        /** 工厂方法模式 - 静态工厂模式 */
        StaticFactoryTest.test();
        System.out.println("==============");
        /** 抽象工厂模式 */
        AbstractFactoryTest.test();
    }
}
