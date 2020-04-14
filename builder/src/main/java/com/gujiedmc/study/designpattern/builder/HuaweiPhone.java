package com.gujiedmc.study.designpattern.builder;

/**
 * 华为手机
 *
 * @author gujiedmc
 * @date 2020/4/6
 */
public class HuaweiPhone extends Phone {

    public HuaweiPhone(String cpu,String screen,String camera) {
        this.cpu = cpu;
        this.screen = screen;
        this.camera = camera;
    }

    @Override
    public void start() {
        System.out.printf("华为手机启动。cpu:%s,screen:%s,camera:%s\n",this.getCpu(),this.getScreen(),this.getCamera());
    }
}
