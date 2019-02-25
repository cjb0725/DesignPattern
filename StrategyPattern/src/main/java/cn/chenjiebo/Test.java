package cn.chenjiebo;

import cn.chenjiebo.concrete.ConcreteStrategyB;
import cn.chenjiebo.context.Context;
import cn.chenjiebo.strategy.Strategy;

/**
 * DesignPattern
 * cn.chenjiebo
 *
 * @author chenjiebo
 * @date 2019/2/25 4:18 PM
 */
public class Test {
    public static void main(String[] args){
        //选择使用的策略
        Strategy s = new ConcreteStrategyB();
        Context context = new Context(s);
        context.contextInterface();
    }
}
