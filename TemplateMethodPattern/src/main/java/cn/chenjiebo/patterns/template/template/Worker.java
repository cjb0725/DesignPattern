package cn.chenjiebo.patterns.template.template;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.template.template
 *
 * @author chenjiebo
 * @date 2019/2/26 11:47 AM
 */
public abstract class Worker {
    protected String name;

    public Worker(String name){
        this.name = name;
    }

    public final void workOneday(){
        System.out.println("-------------start work-------------");
        enterCompany();
        computerOn();
        work();
        computerOff();
        leaveCompany();
        System.out.println("-------------stop work-------------");
    }

    protected void leaveCompany() {
        System.out.println(name + " leaves company.");
    }

    private void computerOff() {
        System.out.println(name + " turns off computer.");
    }

    /**
     * work
     */
    protected abstract void work();

    private void computerOn() {
        System.out.println(name + " turns on computer");
    }

    private void enterCompany() {
        System.out.println(name + " enters company.");
    }
}
