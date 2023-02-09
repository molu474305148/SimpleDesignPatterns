package com.design.patterns;

import com.design.patterns.product.ProductFactory;

/**
 * @author xudeping
 * @date ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        //生产产品A
        System.out.println("--------");
        ProductFactory productFactory = new ProductFactory();
        System.out.println(productFactory.product(productFactory.material("材料A"), "产品A"));

        //生产产品B
        System.out.println("--------");
        System.out.println(productFactory.product(productFactory.material("材料B"), "产品B"));
    }
}

