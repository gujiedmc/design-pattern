package com.gujiedmc.study.designpattern.factory.method;

import com.gujiedmc.study.designpattern.factory.product.ApplePhone;
import com.gujiedmc.study.designpattern.factory.product.Phone;

/**
 * 苹果手机工厂
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public class ApplePhoneFactory extends AbstractPhoneFactory {

    @Override
    public Phone create() {
        System.out.println("苹果手机创建");
        return new ApplePhone();
    }
}
