package com.design.patterns.product;

/**
 * 产品工厂
 *
 * @author xudeping
 * @date 2023/2/9
 */
public class ProductFactory {

    /**
     * 生产产品需要的材料
     *
     * @param material
     * @return
     */
    public String material(String material) {
        return "当前材料：" + material;
    }

    /**
     * 产品生产
     *
     * @param material
     * @param product
     * @return
     */
    public String product(String material, String product) {
        return "当前生产产品：" + product + " --使用的材料：" + material;
    }

}
