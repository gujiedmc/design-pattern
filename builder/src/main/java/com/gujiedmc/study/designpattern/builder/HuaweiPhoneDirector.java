package com.gujiedmc.study.designpattern.builder;

/**
 * 华为手机创建指挥
 *
 * @author gujiedmc
 * @date 2020/4/6
 */
public class HuaweiPhoneDirector {

    public static HuaweiPhone createHuaweiPhone(String cpu, String screen, String camera) {

        AbstractPhoneBuilder builder = new HuaweiPhoneBuilder();
        // 不需要注意顺序
        builder.cpu(cpu);
        builder.screen(screen);
        builder.camera(camera);

        return (HuaweiPhone) builder.build();
    }
}
