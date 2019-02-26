package cn.chenjiebo.patterns.template;

import cn.chenjiebo.patterns.template.concrete.HRWorker;
import cn.chenjiebo.patterns.template.concrete.ProgrammerWorker;
import cn.chenjiebo.patterns.template.concrete.TestWorker;
import cn.chenjiebo.patterns.template.template.Worker;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.template
 *
 * @author chenjiebo
 * @date 2019/2/26 11:56 AM
 */
public class TemplateTest {
    public static void main(String[] args){
        Worker worker1 = new ProgrammerWorker("programmer");
        Worker worker2 = new HRWorker("hr");
        Worker worker3 = new TestWorker("test");
        worker1.workOneday();
        worker2.workOneday();
        worker3.workOneday();
    }
}
