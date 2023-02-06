package com.design.patterns.base;

/**
 * 收费抽象类
 *
 * @author xudeping
 * @date 2023/2/6
 */
public abstract class CashSuper {
    /**
     * 收取费用的抽象方法
     *
     * @param price 价格
     * @param num   数量
     * @return
     */
    public abstract double acceptCash(double price, int num);
}
