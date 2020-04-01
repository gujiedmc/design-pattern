package com.gujiedmc.study.factory.method;

import com.gujiedmc.study.factory.product.AppleWatch;
import com.gujiedmc.study.factory.product.Watch;

/**
 * 苹果手表工厂
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public class AppleWatchFactory extends AbstractWatchFactory {
    @Override
    public Watch create() {
        System.out.println("苹果手表创建");
        return new AppleWatch();
    }
}
