package com.gujiedmc.study.designpattern.decorate;

/**
 * 装饰者实现
 *
 * @author gujiedmc
 * @date 2020/4/14
 */
public class Decorate extends AbstractDecorate {

    public Decorate(Component component) {
        super(component);
    }

    @Override
    public String doSomething() {
        return "进行装饰：" + this.getComponent().doSomething();
    }
}
