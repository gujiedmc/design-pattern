package com.gujiedmc.study.factory.method;

import com.gujiedmc.study.factory.product.HuaweiPhone;
import com.gujiedmc.study.factory.product.Phone;

/**
 * 华为手机工厂
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public class HuaweiPhoneFactory extends AbstractPhoneFactory {

    @Override
    public Phone create() {
        System.out.println("华为手机创建");
        return new HuaweiPhone();
    }
}
