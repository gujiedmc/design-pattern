package com.gujiedmc.study.singleton.lazy;

/**
 * 懒汉式
 * 默认不加载对象，当时用的使用创建对象
 * 这种情况加了锁，虽然可以保证线程安全但是严重影响程序性能
 *
 * @author gujiedmc
 * @date 2020/04/01
 */
public class LazySync {

    private static LazySync instance = null;

    /**
     * 私有化构造函数
     */
    private LazySync() {
    }

    public static synchronized LazySync getInstance() {
        if (instance == null) {
            instance = new LazySync();
        }
        return instance;
    }
}
