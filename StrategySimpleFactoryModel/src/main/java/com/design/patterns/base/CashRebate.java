package com.design.patterns.base;

/**
 * 打折收费
 *
 * @author xudeping
 * @date 2023/2/6
 */
public class CashRebate extends CashSuper {

    /**
     * 折扣率
     */
    private double moneyRebate = 1d;

    /**
     * 构造函数，初始化折扣率
     *
     * @param moneyRebate
     */
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    /**
     * 计算收费
     *
     * @param price 价格
     * @param num   数量
     * @return
     */
    @Override
    public double acceptCash(double price, int num) {
        return price * num * moneyRebate;
    }
}
