package com.gujiedmc.study.designpattern.singleton.lazy;

/**
 * 懒汉式
 * 默认不加载对象，当时用的使用创建对象
 * 这种情况肯定是有线程安全问题的
 *
 * @author gujiedmc
 * @date 2020/04/01
 */
public class LazySimple {

    private static LazySimple instance = null;

    /**
     * 私有化构造函数
     */
    private LazySimple() {
    }

    public static LazySimple getInstance() {
        if (instance == null) {
            instance = new LazySimple();
        }
        return instance;
    }
}
