package com.gujiedmc.study.designpattern.proxy.dynamic.jdk;

import com.gujiedmc.study.designpattern.proxy.IPlayer;
import com.gujiedmc.study.designpattern.proxy.Player;

import java.lang.reflect.Proxy;

/**
 * @author gujiedmc
 * @date 2020/4/7
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        // 被代理对象
        IPlayer player = new Player();
        // 被代理对象执行登录
        player.login("法外狂徒张三");
        // 代理执行逻辑
        JdkProxyInvocationHandler handler = new JdkProxyInvocationHandler(player);
        // 生成代理对象
        IPlayer proxyInstance = (IPlayer) Proxy.newProxyInstance(JdkProxyTest.class.getClassLoader(), new Class[]{IPlayer.class}, handler);
        // 代理对象执行登录
        proxyInstance.login("法外狂徒张三");
    }
}
