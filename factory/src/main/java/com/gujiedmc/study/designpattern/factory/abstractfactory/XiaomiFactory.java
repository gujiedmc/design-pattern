package com.gujiedmc.study.designpattern.factory.abstractfactory;

import com.gujiedmc.study.designpattern.factory.product.Watch;
import com.gujiedmc.study.designpattern.factory.product.XiaomiPhone;
import com.gujiedmc.study.designpattern.factory.product.Phone;

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
