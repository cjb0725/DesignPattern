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
public class HasMoneyState implements State {
    private Machine machine;

    public HasMoneyState(Machine machine){
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Already has money");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Money ejected");
        machine.setCurrentState(machine.getNoMoneyState());
    }

    @Override
    public void dispense() {
        System.out.println("Turn crank first");
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank turned");
        machine.setCurrentState(machine.getSoldState());
    }
}
