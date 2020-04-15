package com.gujiedmc.study.designpattern.facade;

/**
 * 门面模式测试
 *
 * @author gujiedmc
 * @date 2020/4/14
 */
public class FacadeTest {

    public static void main(String[] args) {
        // Client中不关注SubSystem内部实现，只需要调用Facade
        Facade facade = new Facade();
        facade.work1();
        System.out.println("------------");
        facade.work2();
    }
}
