package com.gujiedmc.study.designpattern.factory.abstractfactory;

import com.gujiedmc.study.designpattern.factory.product.Phone;
import com.gujiedmc.study.designpattern.factory.product.Watch;

/**
 * 智能产品生产工厂
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public abstract class AbstractSmartProductFactory {

    public abstract Phone createPhone();

    public abstract Watch createWatch();
}
