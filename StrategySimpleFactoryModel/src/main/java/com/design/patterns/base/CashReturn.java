package com.design.patterns.base;

/**
 * 满减收费
 *
 * @author xudeping
 * @date 2023/2/6
 */
public class CashReturn extends CashSuper {

    /**
     * 返利条件
     */
    private double moneyCondition = 0d;

    /**
     * 返利值
     */
    private double moneyReturn = 0d;

    /**
     * 构造函数，初始化返利条件和返利值
     *
     * @param moneyCondition
     * @param moneyReturn
     */
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    /**
     * 计算收费
     *
     * @param price 价格
     * @param num   数量
     * @return
     */
    public double acceptCash(double price, int num) {
        double result = price * num;
        if (result > moneyCondition && moneyCondition > 0) {
            result = result - Math.floor(result / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
