package com.design.patterns.product;

/**
 * @author xudeping
 * @date 2023/2/9
 */
public class ProductLineA implements FactoryService {

    /**
     * 材料生产
     *
     * @param material
     * @return
     */
    @Override
    public String material(String material) {
        return "当前材料：" + material;
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
        return "当前生产产品：" + product + " --使用的材料：" + material;
    }
}
