package com.gujiedmc.study.singleton;

/**
 * 枚举实现单例
 *
 * @author gujiedmc
 * @date 2020/04/01
 */
public enum EnumSingle {
    /**
     * single
     */
    INSTANCE("enumSingle");

    private String name;

    public String getName() {
        return name;
    }

    EnumSingle(String name) {
        this.name = name;
    }
}
