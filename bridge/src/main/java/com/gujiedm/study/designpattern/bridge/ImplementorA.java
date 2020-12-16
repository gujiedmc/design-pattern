package com.gujiedm.study.designpattern.bridge;

/**
 * @author gujiedmc
 * @date 2020/5/7
 */
public class ImplementorA implements Implementor {
	@Override
	public void doSomething() {
		System.out.println("ImplementorA do something");
	}
}
