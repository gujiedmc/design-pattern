package com.gujiedmc.study.designpattern.prototype.clone;

import java.io.*;

/**
 * 克隆测试
 *
 * @author gujiedmc
 * @date 2020/4/1
 */
public class CloneTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("=====================浅拷贝==================");
        ShallowClone prototype = new ShallowClone("prototype", new ShallowClone.CloneInner("prototype.inner"));
        try {
            ShallowClone clone = (ShallowClone) prototype.clone();
            System.out.println("类地址是否相等：" + (clone == prototype)); // false
            System.out.println("字符串属性地址是否相等：" + (clone.getName() == prototype.getName()));  // true
            System.out.println("引用类属性地址是否相等：" + (clone.getCloneInner() == prototype.getCloneInner()));  // true

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("=====================深拷贝==================");
        DeepClone prototype2 = new DeepClone("prototype", new DeepClone.CloneInner("prototype.inner"));
        try {
            DeepClone clone = (DeepClone) prototype2.clone();
            System.out.println("类地址是否相等：" + (clone == prototype2)); // false
            System.out.println("字符串属性地址是否相等：" + (clone.getName() == prototype2.getName())); // false
            System.out.println("引用类属性地址是否相等：" + (clone.getCloneInner() == prototype2.getCloneInner())); // false

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("===============序列化深克隆================");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(prototype);

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(out.toByteArray()));
        ShallowClone clone2 = (ShallowClone) ois.readObject();

        System.out.println("类地址是否相等：" + (clone2 == prototype)); // false
        System.out.println("字符串属性地址是否相等：" + (clone2.getName() == prototype.getName())); // false
        System.out.println("引用类属性地址是否相等：" + (clone2.getCloneInner() == prototype.getCloneInner())); // false
    }
}
