package com.gujiedmc.study.factory.product;

/**
 * 小米手机
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public class XiaomiPhone implements Phone {
    @Override
    public void start() {
        System.out.println("小米手机启动");
    }
}
