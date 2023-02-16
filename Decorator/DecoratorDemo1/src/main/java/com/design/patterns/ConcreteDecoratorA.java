package com.design.patterns;

/**
 * 具体装饰类A
 *
 * @author xudeping
 * @date 2023/2/16
 */
public class ConcreteDecoratorA extends Decorator {
    /**
     * 具有装饰对象A的操作
     */
    @Override
    public void operation() {
        super.operation();
        System.out.println("具有装饰对象A的操作");
    }
}
