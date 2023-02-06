package com.design.patterns;

import com.design.patterns.context.CashContext;

/**
 * @author xudeping
 * @date ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        CashContext context = new CashContext(2);
        System.out.println(context.getResult(2090, 3));
    }
}