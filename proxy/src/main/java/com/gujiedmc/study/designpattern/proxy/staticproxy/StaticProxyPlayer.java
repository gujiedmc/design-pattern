package com.gujiedmc.study.designpattern.proxy.staticproxy;

import com.gujiedmc.study.designpattern.proxy.IPlayer;

/**
 * 静态代理玩家-代练
 *
 * @author gujiedmc
 * @date 2020/4/7
 */
public class StaticProxyPlayer implements IPlayer {

    private IPlayer player;

    public StaticProxyPlayer(IPlayer player) {
        this.player = player;
    }

    /**
     * 登录
     */
    @Override
    public void login(String username) {
        System.out.println("代练上线");
        this.player.login(username);
    }
}
