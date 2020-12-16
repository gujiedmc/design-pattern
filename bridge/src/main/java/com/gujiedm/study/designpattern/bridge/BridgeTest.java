package com.gujiedm.study.designpattern.bridge;

/**
 * 桥接模式测试
 *
 * @author gujiedmc
 * @date 2020/5/2
 */
public class BridgeTest {

	public static void main(String[] args) {
		Abstraction abstractionA = new AbstractionA(new ImplementorA());
		Abstraction abstractionB = new AbstractionB(new ImplementorB());
		abstractionA.operation();
		abstractionB.operation();
	}
}
