package cn.chenjiebo.patterns.state.state;

/**
 * DesignPattern
 * cn.chenjiebo.patterns.state.state
 *
 * @author chenjiebo
 * @date 2019/2/25 7:58 PM
 */
public interface State {
    /**
     * 投币
     */
    void insertMoney();

    /**
     * 退钱
     */
    void ejectMoney();

    /**
     * 出货
     */
    void dispense();

    /**
     * 转动出货
     */
    void turnCrank();
}
