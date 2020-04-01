package com.gujiedmc.study.singleton.lazy;

/**
 * 懒汉式
 * 默认不加载对象，当时用的使用创建对象
 * 双检查double check 只有第一次创建的时候才会进入同步，后续再创建都不会进入同步
 * 第一次check保证性能 第二次性能和LazyTwo一样为了保证线程安全
 * <p>
 * 但是这个时候还有个问题就是 instance = new LazyThree();这个过程并不是原子性的。
 * 可能会先给instance分配内存引用，再实例化LazyThree。
 * 如果这个时候另外一个线程进来发现instance引用不为null，直接返回，就会返回null对象
 * 解决方法是将单例对象声明为volatile，保证对象的可见性
 *
 * @author gujiedmc
 * @date 2020/04/01
 */
public class LazyDoubleCheckSync {

    private static LazyDoubleCheckSync instance = null;
//    private static volatile LazyThree instance = null; // 保证可见性

    /**
     * 私有化构造函数
     */
    private LazyDoubleCheckSync() {
    }

    public static LazyDoubleCheckSync getInstance() {

        if (instance == null) {
            synchronized (LazyDoubleCheckSync.class) {//只有第一次创建进入同步
                if (instance == null) {
                    instance = new LazyDoubleCheckSync();
                }
            }
        }
        return instance;
    }
}
