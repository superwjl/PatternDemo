package com.tik.pattern.singleton;


import com.tik.pattern.BaseActivity;

public class PatternSingletonAct extends BaseActivity{


    @Override
    protected String getPatternFileName() {
        return "singleton";
    }

    @Override
    protected void afterInitViews() {
        /** 四种方式实现单例 */
        /* 恶汉式 */
        Singleton s1 = Singleton.getIntance();
        /* 懒汉式 */
        Singleton02 s2 = Singleton02.getInstance();
        /* 内部类 */
        Singleton03 s3 = Singleton03.getInstance();
        /* 枚举 */
        Singleton04 s4 = Singleton04.INSTANCE;

        s1.test();
        s2.test();
        s3.test();
        s4.test();
    }
}
