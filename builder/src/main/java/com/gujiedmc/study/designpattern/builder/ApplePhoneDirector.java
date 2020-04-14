package com.gujiedmc.study.designpattern.builder;

/**
 * 苹果手机创建指挥
 *
 * @author gujiedmc
 * @date 2020/4/6
 */
public class ApplePhoneDirector {

    public static ApplePhone createApplePhone(String cpu, String screen, String camera) {

        AbstractPhoneBuilder builder = new ApplePhoneBuilder();
        // 需要注意cpu的设置需要在camera之前
        builder.camera(camera);
        builder.cpu(cpu);
        builder.screen(screen);

        return (ApplePhone) builder.build();
    }
}
