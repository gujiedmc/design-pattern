package com.gujiedmc.study.designpattern.adapter;

/**
 * type-c接口的u盘
 *
 * @author gujiedmc
 * @date 2020/4/11
 */
public class TypeCDisk implements TypeC {

    private String data;

    public TypeCDisk(String data) {
        this.data = data;
    }

    @Override
    public String read() {
        return data;
    }
}
