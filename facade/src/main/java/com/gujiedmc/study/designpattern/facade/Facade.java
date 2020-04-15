package com.gujiedmc.study.designpattern.facade;

/**
 * 门面。对SubSystem系统中的模块进行封装
 *
 * @author gujiedmc
 * @date 2020/4/14
 */
public class Facade {

    /**
     * 执行模块一和二
     */
    public void work1(){
        SubSystemModule1 ssm1 = new SubSystemModule1();
        SubSystemModule2 ssm2 = new SubSystemModule2();

        ssm1.work1();
        ssm2.work1();
    }

    /**
     * 执行模块二和三
     */
    public void work2(){
        SubSystemModule1 ssm1 = new SubSystemModule1();
        SubSystemModule2 ssm2 = new SubSystemModule2();
        SubSystemModule3 ssm3 = new SubSystemModule3();

        ssm2.work1();
        ssm3.work1();
    }
}
