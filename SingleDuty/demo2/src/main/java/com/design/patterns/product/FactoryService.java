package com.design.patterns.product;

/**
 * 产品工厂 接口
 *
 * @author xudeping
 * @date 2023/2/9
 */
public interface FactoryService {

    /**
     * 材料生产
     *
     * @param material
     * @return
     */
    public abstract String material(String material);

    /**
     * 生产产品
     *
     * @param material 材料
     * @param product  产品
     * @return
     */
    public abstract String product(String material, String product);
}
