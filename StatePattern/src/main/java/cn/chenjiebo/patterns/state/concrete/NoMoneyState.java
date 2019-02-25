package cn.chenjiebo.patterns.state.concrete;

import cn.chenjiebo.patterns.state.context.Machine;
import cn.chenjiebo.patterns.state.state.State;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.state.state
 *
 * @author chenjiebo
 * @date 2019/2/25 9:59 PM
 */
public class NoMoneyState implements State {
    private Machine machine;

    public NoMoneyState(Machine machine){
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Inserted money.");
        machine.setCurrentState(machine.getHasMoneyState());
    }

    @Override
    public void ejectMoney() {
        System.out.println("No money to eject.");
    }

    @Override
    public void dispense() {
        System.out.println("Insert money first.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You need to pay to turn.");
    }
}
