package cn.chenjiebo.patterns.observer.manual;

import cn.chenjiebo.patterns.observer.manual.observer.Observer;
import cn.chenjiebo.patterns.observer.manual.observer.impl.ObserverA;
import cn.chenjiebo.patterns.observer.manual.observer.impl.ObserverB;
import cn.chenjiebo.patterns.observer.manual.subject.impl.ConcreteSubject;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.observer.manual
 *
 * @author chenjiebo
 * @date 2019/2/26 10:39 PM
 */
public class ObserverTest {
    public static void main(String[] args){
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer1 = new ObserverA();
        Observer observer2 = new ObserverB();
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.setMsg("init system.");
        subject.removeObserver(observer2);
        subject.setMsg("Today is a good day.");
    }
}
