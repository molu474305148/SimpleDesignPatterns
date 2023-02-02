package com.design.patterns.calculator;

/**
 * 减法 计算
 *
 * @author xudeping
 * @date 2023/2/2
 */
public class Sub extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }
}
