package cn.chenjiebo.patterns.observer.manual.subject;

import cn.chenjiebo.patterns.observer.manual.observer.Observer;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.observer.manual.subject
 *
 * @author chenjiebo
 * @date 2019/2/26 10:29 PM
 */
public interface Subject {
    /**
     * 订阅
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 取消订阅
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
