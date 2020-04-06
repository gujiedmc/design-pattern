package com.gujiedmc.study.builder;

import lombok.Data;

/**
 * 手机抽象建造者
 *
 * @author gujiedmc
 * @date 2020/4/6
 */
@Data
public abstract class AbstractPhoneBuilder {

    private String cpu;

    private String screen;

    private String camera;

    public abstract AbstractPhoneBuilder cpu(String cpu);

    public abstract AbstractPhoneBuilder screen(String screen);

    public abstract AbstractPhoneBuilder camera(String camera);

    public abstract Phone build();
}
