package com.gujiedmc.study.factory.simple;

import com.gujiedmc.study.factory.product.ApplePhone;
import com.gujiedmc.study.factory.product.HuaweiPhone;
import com.gujiedmc.study.factory.product.Phone;

/**
 * 简单工厂模式，根据简单策略直接创建产品。
 */
public class SimpleFactory {

    public static Phone create(String logo) {
        switch (logo) {
            case "huawei":
                return new HuaweiPhone();
            case "apple":
                return new ApplePhone();
            default:
                throw new IllegalArgumentException();
        }
    }
}