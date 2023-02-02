package com.design.patterns.calculator;

/**
 * 加法计算
 *
 * @author xudeping
 * @date 2023/2/2
 */
public class Add extends Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }
}
