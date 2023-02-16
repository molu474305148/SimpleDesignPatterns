package com.design.patterns;

/**
 * @author xudeping
 * @date ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();

        //先用a来装饰component
        a.setComponent(component);
        //再用b来装饰a
        b.setComponent(a);
        //最终执行b的operation
        b.operation();
    }
}