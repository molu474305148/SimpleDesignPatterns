package com.design.patterns;

/**
 * 具体的人
 *
 * @author xudeping
 * @date 2023/2/16
 */
public class PersonImpl implements CharacterService {

    /**
     * 人名称
     */
    private String name;

    /**
     * 构造函数，初始化人名称
     *
     * @param name
     */
    public PersonImpl(String name) {
        this.name = name;
    }


    /**
     * 展示形象
     */
    @Override
    public void show() {
        System.out.println(" 装扮后的" + name + "帅的一笔！");
    }
}
