package cn.chenjiebo.patterns.observer.buildin.observer;

import cn.chenjiebo.patterns.observer.buildin.subject.JavaSubject;
import cn.chenjiebo.patterns.observer.buildin.subject.JawaSubject;

import java.util.Observable;
import java.util.Observer;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.observer.buildin.observer
 *
 * @author chenjiebo
 * @date 2019/2/26 10:46 PM
 */
public class ObserverA implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof JavaSubject) {
            System.out.println("from java A: " + arg);
        }
        if (o instanceof JawaSubject) {
            System.out.println("from jawa A: " + arg);
        }
    }
}
