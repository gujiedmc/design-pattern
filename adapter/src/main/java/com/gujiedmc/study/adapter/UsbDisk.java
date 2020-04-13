package com.gujiedmc.study.adapter;

/**
 * usb接口的u盘
 *
 * @author gujiedmc
 * @date 2020/4/11
 */
public class UsbDisk implements Usb {

    private String data;

    public UsbDisk(String data) {
        this.data = data;
    }

    @Override
    public String read() {
        return data;
    }
}
