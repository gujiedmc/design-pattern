package com.gujiedmc.study.builder;

/**
 * 华为手机建造者
 *
 * @author gujiedmc
 * @date 2020/4/6
 */
public class HuaweiPhoneBuilder extends AbstractPhoneBuilder {

    @Override
    public AbstractPhoneBuilder cpu(String cpu) {
        this.setCpu("华为协议" + cpu);
        return this;
    }

    @Override
    public AbstractPhoneBuilder screen(String screen) {
        this.setScreen("华为排列" + screen);
        return this;
    }

    @Override
    public AbstractPhoneBuilder camera(String camera) {
        this.setCamera("莱卡" + camera);
        return this;
    }

    @Override
    public Phone build() {
        return new HuaweiPhone(this.getCpu(), this.getScreen(), this.getCamera());
    }
}
