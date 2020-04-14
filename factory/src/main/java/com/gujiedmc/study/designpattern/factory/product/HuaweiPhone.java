package com.gujiedmc.study.designpattern.factory.product;

/**
 * 华为手机产品
 */
public class HuaweiPhone implements Phone {

    @Override
    public void start() {
        System.out.println("华为手机开机");
    }
}