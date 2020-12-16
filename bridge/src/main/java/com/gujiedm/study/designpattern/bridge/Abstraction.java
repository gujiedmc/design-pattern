package com.gujiedm.study.designpattern.bridge;

abstract class Abstraction {

	private Implementor implementor;

	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}

	public void operation() {
		implementor.doSomething();
	}
}