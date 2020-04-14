package com.gujiedmc.study.designpattern.proxy.dynamic.cglib;

import com.gujiedmc.study.designpattern.proxy.IPlayer;
import com.gujiedmc.study.designpattern.proxy.Player;
import net.sf.cglib.proxy.Enhancer;

/**
 * cglib代理测试
 *
 * @author gujiedmc
 * @date 2020/4/7
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        // 代理业务逻辑
        CglibMethodInterceptor interceptor = new CglibMethodInterceptor();
        // 代理工厂设置
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Player.class);
        enhancer.setCallback(interceptor);
        // 生成代理类
        IPlayer player = (IPlayer) enhancer.create();
        // 代理类执行登录
        player.login("法外狂徒张三");
    }
}
