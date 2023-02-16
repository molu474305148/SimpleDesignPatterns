package com.design.patterns;

/**
 * ConcreteComponent类
 *
 * @author xudeping
 * @date 2023/2/16
 */
public class ConcreteComponent extends Component {

    /**
     *
     */
    @Override
    public void operation() {
        System.out.println("具体对象的实际操作");
    }
}
