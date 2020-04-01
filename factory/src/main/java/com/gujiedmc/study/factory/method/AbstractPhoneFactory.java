package com.gujiedmc.study.factory.method;

import com.gujiedmc.study.factory.product.Phone;

/**
 * 智能手机生产工厂
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public abstract class AbstractPhoneFactory {

    public abstract Phone create();
}
