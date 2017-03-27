package com.tik.pattern.observer.custom;

/**
 * 所有的观察者需要实现此接口
 */
public interface Observer {
    void update(Subject subject, Object o);
}
