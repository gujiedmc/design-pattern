package com.gujiedmc.study.builder;

import lombok.Data;

/**
 * 手机
 *
 * @author gujiedmc
 * @date 2020/4/6
 */
@Data
public abstract class Phone {

    protected String cpu;

    protected String screen;

    protected String camera;

    public abstract void start();
}
