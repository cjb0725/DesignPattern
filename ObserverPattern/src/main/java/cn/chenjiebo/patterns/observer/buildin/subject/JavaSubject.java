package cn.chenjiebo.patterns.observer.buildin.subject;

import java.util.Observable;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.observer.buildin.subject
 *
 * @author chenjiebo
 * @date 2019/2/26 10:43 PM
 */
public class JavaSubject extends Observable{
    private String msg;

    public void setMsg(String msg){
        this.msg = msg;
        setChanged();
        notifyObservers(msg);
    }
}
