package cn.chenjiebo.patterns.observer.buildin;

import cn.chenjiebo.patterns.observer.buildin.observer.ObserverA;
import cn.chenjiebo.patterns.observer.buildin.observer.ObserverB;
import cn.chenjiebo.patterns.observer.buildin.subject.JavaSubject;
import cn.chenjiebo.patterns.observer.buildin.subject.JawaSubject;

import java.util.Observer;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.observer.buildin
 *
 * @author chenjiebo
 * @date 2019/2/26 10:49 PM
 */
public class ObserverTest {
    public static void main(String[] args){
        JavaSubject javaSubject = new JavaSubject();
        JawaSubject jawaSubject = new JawaSubject();
        Observer observer1 = new ObserverA();
        Observer observer2 = new ObserverB();
        javaSubject.addObserver(observer1);
        javaSubject.addObserver(observer2);
        javaSubject.setMsg("haha");
        javaSubject.deleteObserver(observer1);
        javaSubject.setMsg("heihei");

        jawaSubject.addObserver(observer1);
        jawaSubject.addObserver(observer2);
        jawaSubject.setMsg("aaaa");
        jawaSubject.deleteObserver(observer1);
        jawaSubject.setMsg("bbbb");
    }
}
