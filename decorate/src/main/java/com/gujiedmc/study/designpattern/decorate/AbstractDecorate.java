package com.gujiedmc.study.designpattern.decorate;

/**
 * 抽象装饰者
 *
 * @author gujiedmc
 * @date 2020/4/14
 */
public abstract class AbstractDecorate implements Component{

    private Component component;

    public AbstractDecorate(Component component) {
        this.component = component;
    }

    protected Component getComponent() {
        return component;
    }
}
