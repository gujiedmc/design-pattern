package com.gujiedmc.study.designpattern.singleton.lazy;

/**
 * 使用内部类的特性保证单例
 * <p>
 * 内部类的加载是在外部类第一次使用时
 *
 * @author gujiedmc
 * @date 2020/04/01
 */
public class LazyInnerClass {

    private LazyInnerClass() {
    }

    public static LazyInnerClass getInstance() {
        return ClassHolder.LAZY_INNER;
    }

    private static class ClassHolder {
        static final LazyInnerClass LAZY_INNER = new LazyInnerClass();
    }
}
