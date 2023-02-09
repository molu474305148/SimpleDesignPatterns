package com.design.patterns.product;

/**
 * 产品线B
 *
 * @author xudeping
 * @date 2023/2/9
 */
public class ProductLineB implements FactoryService {

    /**
     * 材料生产
     *
     * @param material
     * @return
     */
    @Override
    public String material(String material) {
        return "B当前材料：" + material;
    }

    /**
     * 生产产品
     *
     * @param material 材料
     * @param product  产品
     * @return
     */
    @Override
    public String product(String material, String product) {
        return "B当前生产产品：" + product + " --B使用的材料：" + material;
    }
}