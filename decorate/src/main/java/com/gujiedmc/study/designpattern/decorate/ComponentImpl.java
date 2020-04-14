package com.gujiedmc.study.designpattern.decorate;

/**
 * 组件实现
 *
 * @author gujiedmc
 * @date 2020/4/14
 */
public class ComponentImpl implements Component {

    @Override
    public String doSomething() {
        return "执行操作";
    }
}
