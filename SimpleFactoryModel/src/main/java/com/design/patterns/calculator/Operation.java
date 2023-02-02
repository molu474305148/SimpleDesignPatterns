package com.design.patterns.calculator;

/**
 * 计算器运算抽象类
 *
 * @author xudeping
 * @date 2023/2/2
 */
public abstract class Operation {

    /**
     * 计算a,b值
     *
     * @param numberA 值a
     * @param numberB 值b
     * @return
     */
    public double getResult(double numberA, double numberB) {
        return 0L;
    }

}
