package com.gujiedmc.study.builder;

/**
 * 建造者模式测试
 *
 * @author gujiedmc
 * @date 2020/4/6
 */
public class BuilderTest {

    public static void main(String[] args) {

        HuaweiPhone huaweiPhone = HuaweiPhoneDirector.createHuaweiPhone("麒麟980", "1080p lcd", "4摄");
        huaweiPhone.start();

        ApplePhone applePhone = ApplePhoneDirector.createApplePhone("A12", "1440p oled", "3摄");
        applePhone.start();
    }
}
