package com.gujiedmc.study.factory.abstractfactory;

import com.gujiedmc.study.factory.product.Phone;
import com.gujiedmc.study.factory.product.Watch;
import com.gujiedmc.study.factory.product.XiaomiPhone;

/**
 * 小米智能产品工厂
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public class XiaomiFactory extends AbstractSmartProductFactory {

    @Override
    public Phone createPhone() {
        System.out.println("小米手机创建");
        return new XiaomiPhone();
    }

    @Override
    public Watch createWatch() {
        System.out.println("小米不产手表，你可以购买我们的手环");
        throw new UnsupportedOperationException();
    }
}
