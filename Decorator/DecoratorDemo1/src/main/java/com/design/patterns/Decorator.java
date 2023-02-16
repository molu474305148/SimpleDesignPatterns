package com.design.patterns;

/**
 * 装饰抽象类
 *
 * @author xudeping
 * @date 2023/2/16
 */
abstract class Decorator extends Component {
    protected Component component;

    /**
     * 装饰一个Component对象
     *
     * @param component
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 重写Operation，实际调用的是component中的Operation 方法
     */
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
