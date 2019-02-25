package cn.chenjiebo.patterns.state.concrete;

import cn.chenjiebo.patterns.state.context.Machine;
import cn.chenjiebo.patterns.state.state.State;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.state.state
 *
 * @author chenjiebo
 * @date 2019/2/25 10:00 PM
 */
public class SoldOutState implements State {
    private Machine machine;

    public SoldOutState(Machine machine){
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Sold out.");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Sold out.");
    }

    @Override
    public void dispense() {
        System.out.println("Sold out.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sold out.");
    }
}
