package com.gujiedmc.study.designpattern.decorate;

import java.io.*;
import java.net.URL;

/**
 * 装饰者模式测试
 *
 * @author gujiedmc
 * @date 2020/4/14
 */
public class DecorateTest {

    public static void main(String[] args) throws Exception{
        Component component = new ComponentImpl();

        String str = component.doSomething();
        System.out.println(str);

        // 动态增强component
        AbstractDecorate decorate = new Decorate(component);
        String str2 = decorate.doSomething();
        System.out.println(str2);

        //
        URL url = DecorateTest.class.getClassLoader().getResource("test.txt");
        File file = new File(url.getFile());
        Reader reader = new FileReader(file);
        // 进行装饰，可以引入缓存区，对读取的字节进行缓存，提高读取性能
        BufferedReader bufferedReader = new BufferedReader(reader);
        // 进项装饰，可以读取行号
        LineNumberReader lineNumberReader = new LineNumberReader(bufferedReader);

        String tmp;
        while ((tmp = lineNumberReader.readLine())!= null){
            System.out.println(lineNumberReader.getLineNumber()+":"+tmp);
        }
    }
}
