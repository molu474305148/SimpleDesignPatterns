package com.design.patterns;

import com.design.patterns.service.ProductAService;

/**
 * @author xudeping
 * @date ${DATE}
 */
public class Main {
    public static void main(String[] args) {

        ProductAService productAService = new ProductAService("材料：大米 ");
        System.out.println(productAService.product());


    }
}