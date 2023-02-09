package com.design.patterns.service;

/**
 * @author xudeping
 * @date 2023/2/9
 */
public class ProductAService implements ProductProcessingService {

    ProductAMaterial productAMaterial;

    private String material;

    public ProductAService(String material) {
        this.productAMaterial = new ProductAMaterial();
        this.material = material;
    }
    public String product() {
        return productAMaterial.material(material) + "生产产品A";
    }
}
