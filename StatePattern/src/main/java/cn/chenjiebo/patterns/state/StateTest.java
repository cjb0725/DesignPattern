package cn.chenjiebo.patterns.state;

import cn.chenjiebo.patterns.state.context.Machine;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.state
 *
 * @author chenjiebo
 * @date 2019/2/25 10:25 PM
 */
public class StateTest {
    public static void main(String[] args){
        Machine machine = new Machine(2);
        System.out.println(machine.getRemaining());
        machine.insertMoney();
        machine.ejectMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.insertMoney();
        machine.turnCrank();
        System.out.println(machine.getRemaining());
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        System.out.println(machine.getRemaining());
        machine.turnCrank();
    }
}
