package cn.chenjiebo.patterns.template.concrete;

import cn.chenjiebo.patterns.template.template.Worker;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.template.concrete
 *
 * @author chenjiebo
 * @date 2019/2/26 11:53 AM
 */
public class HRWorker extends Worker{
    public HRWorker(String name){
        super(name);
    }

    @Override
    protected void work() {
        System.out.println(name + " working hr.");
    }
}
