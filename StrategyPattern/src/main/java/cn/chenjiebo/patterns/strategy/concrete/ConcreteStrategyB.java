package cn.chenjiebo.patterns.strategy.concrete;

import cn.chenjiebo.patterns.strategy.strategy.Strategy;

/**
 * DesignPattern
 * cn.chenjiebo
 *
 * @author chenjiebo
 * @date 2019/2/25 4:17 PM
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        //相关的业务
        System.out.println("This is B");
    }
}
