package com.design.patterns.service;

/**
 * @author xudeping
 * @date 2023/2/9
 */
public class ProductAMaterial implements MaterialProcessingService {
    @Override
    public String material(String material) {
        return "产品A材料：" + material;
    }
}
