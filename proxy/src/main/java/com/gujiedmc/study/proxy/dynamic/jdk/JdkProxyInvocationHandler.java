package com.gujiedmc.study.proxy.dynamic.jdk;

import com.gujiedmc.study.proxy.IPlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk代理方法处理
 *
 * @author gujiedmc
 * @date 2020/4/7
 */
public class JdkProxyInvocationHandler implements InvocationHandler {

    private IPlayer target;

    public JdkProxyInvocationHandler(IPlayer target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk代理before");
        Object invoke = method.invoke(target, args);
        System.out.println("jdk代理after");
        return invoke;
    }
}
