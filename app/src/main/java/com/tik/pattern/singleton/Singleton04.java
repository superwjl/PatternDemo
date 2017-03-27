package com.tik.pattern.singleton;

/**
 * 使用Java的枚举
 */
public enum Singleton04 {
    INSTANCE;

    private Singleton04() {
    }

    protected void test(){
        System.out.println("i am singleton04.");
    }
}
