package com.gujiedmc.study.proxy;

/**
 * 具体玩家
 *
 * @author gujiedmc
 * @date 2020/4/7
 */
public class Player implements IPlayer {

    /**
     * 登录
     */
    @Override
    public void login(String username) {
        System.out.println("游戏登录" + username);
    }
}
