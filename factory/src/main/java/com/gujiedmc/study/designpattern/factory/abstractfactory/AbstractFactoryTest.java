package com.gujiedmc.study.designpattern.factory.abstractfactory;

import com.gujiedmc.study.designpattern.factory.product.Phone;
import com.gujiedmc.study.designpattern.factory.product.Watch;

/**
 * 抽象工厂模式测试
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        AbstractSmartProductFactory smartProductFactory = null;
        Phone phone = null;
        Watch watch = null;

        // 苹果
        smartProductFactory = new AppleFactory();
        phone = smartProductFactory.createPhone();
        phone.start();
        watch = smartProductFactory.createWatch();
        watch.showTime();

        // 华为
        smartProductFactory = new HuaweiFactory();
        phone = smartProductFactory.createPhone();
        phone.start();
        watch = smartProductFactory.createWatch();
        watch.showTime();

        // 小米
        smartProductFactory = new XiaomiFactory();
        phone = smartProductFactory.createPhone();
        phone.start();
        watch = smartProductFactory.createWatch();
        watch.showTime();
    }
}
