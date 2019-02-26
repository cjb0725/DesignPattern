package cn.chenjiebo.patterns.observer.manual.subject.impl;

import cn.chenjiebo.patterns.observer.manual.observer.Observer;
import cn.chenjiebo.patterns.observer.manual.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.observer.manual.subject.impl
 *
 * @author chenjiebo
 * @date 2019/2/26 10:33 PM
 */
public class ConcreteSubject implements Subject{
    private List<Observer> observers;
    private String msg;

    public ConcreteSubject(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(msg));
    }

    public void setMsg(String msg){
        this.msg = msg;
        notifyObservers();
    }
}
