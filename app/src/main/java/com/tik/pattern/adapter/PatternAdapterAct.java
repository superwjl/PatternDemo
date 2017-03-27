package com.tik.pattern.adapter;


import com.tik.pattern.BaseActivity;
import com.tik.pattern.adapter.adapter4class.AdapterForClass;
import com.tik.pattern.adapter.adapter4class.Targetable;
import com.tik.pattern.adapter.adapter4interface.SourceSub1;
import com.tik.pattern.adapter.adapter4interface.SourceSub2;
import com.tik.pattern.adapter.adapter4interface.Sourceable;
import com.tik.pattern.adapter.adapter4object.Source2;
import com.tik.pattern.adapter.adapter4object.Targetable2;
import com.tik.pattern.adapter.adapter4object.Wrapper;

public class PatternAdapterAct extends BaseActivity {
    @Override
    protected String getPatternFileName() {
        return "adapter";
    }

    @Override
    protected void afterInitViews() {
        /** 类的适配 */
        Targetable targetable = new AdapterForClass();
        targetable.method1();
        targetable.method2();
        System.out.println("----------------");
        /** 对象的适配 */
        Source2 source2 = new Source2();
        Targetable2 targetable2 = new Wrapper(source2);
        targetable2.method1();
        targetable2.method2();
        System.out.println("----------------");
        /** 接口的适配 */
        Sourceable s1 = new SourceSub1();
        Sourceable s2 = new SourceSub2();
        s1.method1();
        s1.method2();
        s2.method1();
        s2.method2();
    }
}
