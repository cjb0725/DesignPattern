package cn.chenjiebo.patterns.strategy;

import cn.chenjiebo.patterns.strategy.concrete.ConcreteStrategyB;
import cn.chenjiebo.patterns.strategy.context.Context;
import cn.chenjiebo.patterns.strategy.strategy.Strategy;

/**
 * DesignPattern
 * cn.chenjiebo
 *
 * @author chenjiebo
 * @date 2019/2/25 4:18 PM
 */
public class StrategyTest {
    public static void main(String[] args){
        //选择使用的策略
        Strategy s = new ConcreteStrategyB();
        Context context = new Context(s);
        context.contextInterface();
    }
}
