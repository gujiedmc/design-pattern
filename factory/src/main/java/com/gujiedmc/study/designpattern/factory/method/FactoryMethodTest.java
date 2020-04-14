package com.gujiedmc.study.designpattern.factory.method;

import com.gujiedmc.study.designpattern.factory.product.Phone;
import com.gujiedmc.study.designpattern.factory.product.Watch;

/**
 * 工厂方法模式测试
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        AbstractPhoneFactory phoneFactory;
        AbstractWatchFactory watchFactory;
        Phone phone;
        Watch watch;

        // 苹果手机
        phoneFactory = new ApplePhoneFactory();
        phone = phoneFactory.create();
        phone.start();
        // 华为手机
        phoneFactory = new HuaweiPhoneFactory();
        phone = phoneFactory.create();
        phone.start();
        // 苹果手表
        watchFactory = new AppleWatchFactory();
        watch = watchFactory.create();
        watch.showTime();
        // 华为手表
        watchFactory = new HuaweiWatchFactory();
        watch = watchFactory.create();
        watch.showTime();
    }
}
