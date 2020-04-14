package com.gujiedmc.study.designpattern.proxy.staticproxy;

import com.gujiedmc.study.designpattern.proxy.IPlayer;
import com.gujiedmc.study.designpattern.proxy.Player;

/**
 * 静态代理测试
 *
 * @author gujiedmc
 * @date 2020/4/7
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        // 被代理对象
        IPlayer target = new Player();
        target.login("法外狂徒张三");
        // 生成代理对象
        IPlayer proxy = new StaticProxyPlayer(target);
        // 代练上线
        proxy.login("法外狂徒张三");
    }
}
