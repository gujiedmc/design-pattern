package com.gujiedmc.study.factory.abstractfactory;

import com.gujiedmc.study.factory.product.ApplePhone;
import com.gujiedmc.study.factory.product.AppleWatch;
import com.gujiedmc.study.factory.product.Phone;
import com.gujiedmc.study.factory.product.Watch;

/**
 * 苹果智能产品工厂
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public class AppleFactory extends AbstractSmartProductFactory {
    @Override
    public Phone createPhone() {
        System.out.println("苹果手机创建");
        return new ApplePhone();
    }

    @Override
    public Watch createWatch() {
        System.out.println("苹果手表创建");
        return new AppleWatch();
    }
}
