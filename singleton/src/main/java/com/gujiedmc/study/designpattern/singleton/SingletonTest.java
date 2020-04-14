package com.gujiedmc.study.designpattern.singleton;

import com.gujiedmc.study.designpattern.singleton.lazy.*;
import com.gujiedmc.study.singleton.lazy.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

/**
 * 单例模式测试
 *
 * @author gujiedmc
 * @date 2020/3/31
 */
public class SingletonTest {

    private static int count = 1000000;
    private static int threadCount = 100;


    public static void main(String[] args) throws Exception {

        System.out.print("EnumSingle\t");
        testCreate(() -> EnumSingle.INSTANCE);

        System.out.print("HungarySingleton\t");
        testCreate(HungarySingleton::getInstance);

        System.out.print("RegisterSingleton\t");
        testCreate(() -> RegisterSingleton.getInstance(RegisterSingleton.class.getName()));

        System.out.print("LazySimple\t");
        testCreate(LazySimple::getInstance);
        System.out.print("LazySync\t");
        testCreate(LazySync::getInstance);
        System.out.print("LazyDoubleCheckSync\t");
        testCreate(LazyDoubleCheckSync::getInstance);
        System.out.print("LazyDoubleCheckVolatileSync\t");
        testCreate(LazyDoubleCheckVolatileSync::getInstance);
        System.out.print("LazyInnerClass\t");
        testCreate(LazyInnerClass::getInstance);

    }

    /**
     * 单例获取对象，性能和线程安全性测试
     */
    private static void testCreate(Supplier supplier) throws InterruptedException {

        Set<Object> resultSet = new TreeSet<>((o1, o2) -> o1.equals(o2) ? 0 : 1);
        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);

        CountDownLatch countDownLatch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            executorService.submit(() -> {
                Object instance = supplier.get();
                resultSet.add(instance);
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();

        System.out.println("耗时：\t" + (end - start) + "ms\t创建\t" + resultSet.size() + "\t个对象");
        executorService.shutdown();

    }

    /**
     * 查看对象创建性能，模拟单线程创建10000个单例对象的时间消耗
     */
    private static void testCreateSpeed(Class<?> clazz, Integer count) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Method getInstance = clazz.getDeclaredMethod("getInstance");
            getInstance.invoke(null);
        }
        long end = System.currentTimeMillis();

        System.out.println("创建" + count + "个" + clazz.getName() + "对象耗时：" + (end - start) + "ms");
    }

    /**
     * 查看是否线程安全，模拟1000个线程同时创建单例对象
     */
    private static void testThreadSafe(Class<?> clazz, Integer count) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(count);
        CountDownLatch countDownLatch = new CountDownLatch(count);
        Set<Object> resultSet = new TreeSet<>((o1, o2) -> o1.equals(o2) ? 0 : 1);
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                try {
                    cyclicBarrier.await();
                    Method getInstance = clazz.getDeclaredMethod("getInstance");
                    Object instance = getInstance.invoke(null);
                    resultSet.add(instance);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        System.out.println(resultSet);
    }
}
