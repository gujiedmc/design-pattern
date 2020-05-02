package com.gujiedmc.study.designpattern.flyweight;

/**
 * 享元模式测试
 *
 * @author gujiedmc
 * @date 2020/4/21
 */
public class FlyweightTest {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    /**
     * 不使用享元模式，为每一个员工都创建一个部门属性
     */
    private static void test1() {
        AbstractRoom room1 = new StandardRoom( 101);
        Employee employee1 = new Employee("张三", room1);

        AbstractRoom room2 = new StandardRoom( 101);
        Employee employee2 = new Employee("李四", room2);

        System.out.println(employee1.getRoom() == employee2.getRoom()); // false
    }

    /**
     * 使用享元模式，从部门共享池获取部门
     */
    private static void test2() {
        AbstractRoom room1 = RoomFactory.get( 101);
        Employee employee1 = new Employee("张三", room1);

        AbstractRoom room2 = RoomFactory.get(101);
        Employee employee2 = new Employee("李四", room2);

        System.out.println(employee1.getRoom() == employee2.getRoom()); // true
    }

    /**
     * Jdk 中的字符串常量池
     */
    private static void test3(){

        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ab" + 'c';
        String s4 = new String("abc");
        String s5 = new String("ab")+"c";
        String s6 = s5.intern(); // 手动插入常量池

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); // false
        System.out.println(s1 == s5); // false
        System.out.println(s1 == s6); // true

    }
}
