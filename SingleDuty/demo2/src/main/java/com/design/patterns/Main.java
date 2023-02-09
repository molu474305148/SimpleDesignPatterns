package com.design.patterns;

import com.design.patterns.product.ProductLineA;
import com.design.patterns.product.ProductLineB;

/**
 * @author xudeping
 * @date ${DATE}
 */
public class Main {
    public static void main(String[] args) {



        ProductLineA productLineA = new ProductLineA();
        System.out.println(productLineA.product(productLineA.material("材料A"), "产品A"));
        System.out.println("-------");
        ProductLineB productLineB = new ProductLineB();
        System.out.println(productLineB.product(productLineB.material("材料B"), "产品B"));
    }
}