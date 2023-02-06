package com.design.patterns.context;

import com.design.patterns.base.CashRebate;
import com.design.patterns.base.CashReturn;
import com.design.patterns.base.CashSuper;

/**
 * @author xudeping
 * @date 2023/2/6
 */
public class CashContext {
    private CashSuper cashSuper;

    /**
     * 构造函数，定位具体的策略
     *
     * @param cashType
     */
    public CashContext(int cashType) {
        switch (cashType) {
            case 1:
                this.cashSuper = new CashRebate(0.8d);
                break;
            case 2:
                this.cashSuper = new CashReturn(330d, 100d);
                break;
            default:
                this.cashSuper = new CashRebate(1d);
                break;
        }
    }

    /**
     * 根据不同的策略 计算不一样的价格
     *
     * @param price 价格
     * @param num   数量
     * @return
     */
    public double getResult(double price, int num) {
        return this.cashSuper.acceptCash(price, num);
    }
}
