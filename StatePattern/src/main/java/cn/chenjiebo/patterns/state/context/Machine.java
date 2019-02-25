package cn.chenjiebo.patterns.state.context;

import cn.chenjiebo.patterns.state.concrete.HasMoneyState;
import cn.chenjiebo.patterns.state.concrete.NoMoneyState;
import cn.chenjiebo.patterns.state.concrete.SoldOutState;
import cn.chenjiebo.patterns.state.concrete.SoldState;
import cn.chenjiebo.patterns.state.state.*;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.state.context
 *
 * @author chenjiebo
 * @date 2019/2/25 10:01 PM
 */
public class Machine {
    private State noMoneyState;
    private State hasMoneyState;
    private State soldState;
    private State soldOutState;

    private int remaining = 0;
    private State currentState;

    public Machine(int remaining){
        // 初始化变量
        this.remaining = remaining;
        this.noMoneyState  = new NoMoneyState(this);
        this.hasMoneyState = new HasMoneyState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        //初始化状态
        if (remaining > 0){
            this.currentState = noMoneyState;
        }
        else {
            this.currentState = soldOutState;
        }
    }

    public void insertMoney() {
        currentState.insertMoney();
    }

    public void ejectMoney() {
        currentState.ejectMoney();
    }

    private void dispense() {
        currentState.dispense();
    }

    public void turnCrank() {
        currentState.turnCrank();
        dispense();
    }

    public void release(){
        System.out.println("Sold one.");
        this.remaining -= 1;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public void setCurrentState(State state){
        this.currentState = state;
    }

}
