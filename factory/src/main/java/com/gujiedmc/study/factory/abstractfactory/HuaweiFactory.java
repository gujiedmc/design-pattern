package com.gujiedmc.study.factory.abstractfactory;

import com.gujiedmc.study.factory.product.HuaweiPhone;
import com.gujiedmc.study.factory.product.HuaweiWatch;
import com.gujiedmc.study.factory.product.Phone;
import com.gujiedmc.study.factory.product.Watch;

/**
 * 华为智能产品工厂
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public class HuaweiFactory extends AbstractSmartProductFactory {
    @Override
    public Phone createPhone() {
        System.out.println("华为手机创建");
        return new HuaweiPhone();
    }

    @Override
    public Watch createWatch() {
        System.out.println("华为手表创建");
        return new HuaweiWatch();
    }
}
