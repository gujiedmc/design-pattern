package com.gujiedmc.study.designpattern.adapter;

/**
 * 计算机，可以从USB接口中读取信息
 *
 * @author gujiedmc
 * @date 2020/4/11
 */
public class Computer {

    public void readDiskData(Usb usb) {
        System.out.println("电脑端获取到数据：" + usb.read());
    }
}
