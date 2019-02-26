package cn.chenjiebo.patterns.observer.manual.observer;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.observer.manual.observer
 *
 * @author chenjiebo
 * @date 2019/2/26 10:29 PM
 */
public interface Observer {
    /**
     * 更新订阅消息
     * @param msg 消息
     */
    void update(String msg);
}
