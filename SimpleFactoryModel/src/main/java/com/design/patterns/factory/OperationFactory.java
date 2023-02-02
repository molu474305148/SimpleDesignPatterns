package com.design.patterns.factory;

import com.design.patterns.calculator.Add;
import com.design.patterns.calculator.Operation;
import com.design.patterns.calculator.Sub;

/**
 * 简单运算仓库
 *
 * @author xudeping
 * @date 2023/2/2
 */
public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Sub();
                break;
            default:
                operation = null;
        }
        return operation;
    }
}
