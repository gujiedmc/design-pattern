package com.gujiedmc.study.factory.product;

/**
 * 苹果智能手表
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public class AppleWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println("华为手表显示时间");
    }
}
