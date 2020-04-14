package com.gujiedmc.study.designpattern.adapter;

/**
 * @author gujiedmc
 * @date 2020/4/11
 */
public class AdapterTest {

    public static void main(String[] args) {
        Usb usb = new UsbDisk("usb接口U盘中的信息");

        Computer computer = new Computer();
        computer.readDiskData(usb);

        TypeC typeC = new TypeCDisk("type-c接口u盘中的信息");
        // Computer不支持TypeC接口，用转换器适配
        computer.readDiskData(new TypeC2UsbAdapter(typeC));
    }
}
