package com.gujiedmc.study.designpattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib方法拦截器
 *
 * @author gujiedmc
 * @date 2020/4/7
 */
public class CglibMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理before");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib代理after");
        return result;
    }
}
