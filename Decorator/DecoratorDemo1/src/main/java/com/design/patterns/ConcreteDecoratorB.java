package com.design.patterns;

/**
 * 具体装饰类B
 *
 * @author xudeping
 * @date 2023/2/16
 */
public class ConcreteDecoratorB extends Decorator {
    /**
     * 具体装饰对象B的独有操作”
     */
    @Override
    public void operation() {
        super.operation();
        System.out.println("具体装饰对象B的操作");
    }
}
