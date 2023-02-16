package com.design.patterns;

/**
 * 服饰类
 *
 * @author xudeping
 * @date 2023/2/16
 */
public class FineryImpl implements CharacterService {

    protected CharacterService service;

    /**
     * 装饰形象
     *
     * @param service
     */
    public void decorator(CharacterService service) {
        this.service = service;
    }

    /**
     * 展示形象
     */
    @Override
    public void show() {
        if (service != null) {
            service.show();
        }
    }
}
