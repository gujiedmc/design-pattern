package com.gujiedmc.study.factory.method;

import com.gujiedmc.study.factory.product.Watch;

/**
 * 手表工厂
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public abstract class AbstractWatchFactory {

    public abstract Watch create();
}
