package cn.chenjiebo.concrete;

import cn.chenjiebo.strategy.Strategy;

/**
 * DesignPattern
 * cn.chenjiebo
 *
 * @author chenjiebo
 * @date 2019/2/25 4:17 PM
 */
public class ConcreteStrategyC implements Strategy {
    @Override
    public void algorithmInterface() {
        //相关的业务
        System.out.println("This is C");
    }
}
