package com.gujiedmc.study.builder;

/**
 * 苹果手机建造者
 *
 * @author gujiedmc
 * @date 2020/4/6
 */
public class ApplePhoneBuilder extends AbstractPhoneBuilder {

    @Override
    public AbstractPhoneBuilder cpu(String cpu) {
        this.setCpu(cpu);
        return this;
    }

    @Override
    public AbstractPhoneBuilder screen(String screen) {
        this.setScreen("苹果retina" + screen);
        return this;
    }

    @Override
    public AbstractPhoneBuilder camera(String camera) {
        String cpu = this.getCpu();
        if (cpu == null || "".equalsIgnoreCase(cpu)){
            throw new IllegalArgumentException("需要设置CPU");
        }
        if ("A13".equalsIgnoreCase(cpu)) {
            this.setCamera("支持AI写实风格" + camera);
        } else {
            this.setCamera("写实风格" + camera);
        }
        return this;
    }

    @Override
    public Phone build() {
        return new ApplePhone(this.getCpu(), this.getScreen(), this.getCamera());
    }
}
