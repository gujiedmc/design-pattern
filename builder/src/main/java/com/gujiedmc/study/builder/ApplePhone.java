package com.gujiedmc.study.builder;

/**
 * 苹果手机
 *
 * @author gujiedmc
 * @date 2020/4/6
 */
public class ApplePhone extends Phone {

    public ApplePhone(String cpu,String screen,String camera) {
        this.cpu = cpu;
        this.screen = screen;
        this.camera = camera;
    }

    @Override
    public void start() {
        System.out.printf("苹果手机启动。cpu:%s,screen:%s,camera:%s\n",this.getCpu(),this.getScreen(),this.getCamera());
    }
}
