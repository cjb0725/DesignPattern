package cn.chenjiebo.patterns.observer.manual.observer.impl;

import cn.chenjiebo.patterns.observer.manual.observer.Observer;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.observer.manual.observer.impl
 *
 * @author chenjiebo
 * @date 2019/2/26 10:39 PM
 */
public class ObserverB implements Observer{
    @Override
    public void update(String msg) {
        System.out.println("B: " + msg);
    }
}
