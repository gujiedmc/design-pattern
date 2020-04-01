package com.gujiedmc.study.factory.simple;

import com.gujiedmc.study.factory.product.Phone;

/**
 * 简单工厂测试
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Phone phone = SimpleFactory.create("huawei");
        phone.start();
    }
}
