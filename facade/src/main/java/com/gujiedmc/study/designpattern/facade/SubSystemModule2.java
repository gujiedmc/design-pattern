package com.gujiedmc.study.designpattern.facade;

/**
 * @author gujiedmc
 * @date 2020/4/14
 */
public class SubSystemModule2 {

    public void work1(){
        System.out.println("子系统模块二对外方法执行");
    }
    /**
     * 内部方法
     */
    public void work2(){
        System.out.println("子系统模块二内部方法执行");
    }
}
