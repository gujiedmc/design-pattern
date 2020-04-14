package com.gujiedmc.study.designpattern.singleton;

/**
 * 饿汉式单例
 *
 * @author gujiedmc
 * @date 2020/04/01
 */
public class HungarySingleton {

    private static final HungarySingleton INSTANCE = new HungarySingleton();

    /**
     * 私有化构造函数
     */
    private HungarySingleton() {
    }

    public static HungarySingleton getInstance() {
        return INSTANCE;
    }

}
