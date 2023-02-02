package com.design.patterns;

import com.design.patterns.calculator.Operation;
import com.design.patterns.factory.OperationFactory;

/**
 * @author xudeping
 * @date ${DATE}
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("--------" + getResult(2, 1, "+"));
        System.out.println("--------" + getResult(2, 1, "-"));
    }

    public static double getResult(double n, double m, String operate) {
        Operation obj = OperationFactory.createOperation(operate);
        return obj.getResult(n, m);
    }
}