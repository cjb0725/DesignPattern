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
public class SoldState implements State {
    private Machine machine;

    public SoldState(Machine machine){
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Please wait.");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Please wait.");
    }

    @Override
    public void dispense() {
        machine.release();
        if (machine.getRemaining() > 0){
            machine.setCurrentState(machine.getNoMoneyState());
        }
        else {
            machine.setCurrentState(machine.getSoldOutState());
        }
    }

    @Override
    public void turnCrank() {
        System.out.println("Please wait.");
    }
}
