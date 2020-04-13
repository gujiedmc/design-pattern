package com.gujiedmc.study.adapter;

/**
 * 将TypeC转成USB的转换器
 *
 * @author gujiedmc
 * @date 2020/4/11
 */
public class TypeC2UsbAdapter implements Usb {

    private TypeC typeC;

    public TypeC2UsbAdapter(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public String read() {
        return this.typeC.read();
    }
}
