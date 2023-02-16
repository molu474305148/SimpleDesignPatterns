package com.design.patterns;

/**
 * @author xudeping
 * @date ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        PersonImpl person = new PersonImpl("小明");
        //上衣
        Coat coat = new Coat();
        //下衣
        Undergarment undergarment = new Undergarment();

        //上衣装饰小明
        coat.decorator(person);
        //下衣装饰 被上衣装饰后的小明
        undergarment.decorator(coat);

        //展示
        undergarment.show();

    }
}