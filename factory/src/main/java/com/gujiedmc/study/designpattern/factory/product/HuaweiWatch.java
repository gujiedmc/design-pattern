package com.gujiedmc.study.designpattern.factory.product;

/**
 * 华为智能手表
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public class HuaweiWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println("华为手表显示时间");
    }
}
