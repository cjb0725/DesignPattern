package cn.chenjiebo.patterns.template.concrete;

import cn.chenjiebo.patterns.template.template.Worker;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.template.concrete
 *
 * @author chenjiebo
 * @date 2019/2/26 11:52 AM
 */
public class ProgrammerWorker extends Worker{
    public ProgrammerWorker(String name){
        super(name);
    }

    @Override
    protected void work() {
        System.out.println(name + " programming.");
    }

    @Override
    protected void leaveCompany(){
        super.leaveCompany();
        System.out.println(name + " can't leave.");
    }
}
