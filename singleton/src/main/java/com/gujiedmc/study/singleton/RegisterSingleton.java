package com.gujiedmc.study.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例
 *
 * @author gujiedmc
 * @date 2020/04/01
 */
public class RegisterSingleton{

    private String name;

    private RegisterSingleton(String name){
        this.name = name;
    }
    //向注册中心添加单例对象
    private static final Map<String, RegisterSingleton> context = new ConcurrentHashMap<>();

    public static RegisterSingleton getInstance(final String name) {
        if(name == null){
            throw new NullPointerException();
        }
        context.computeIfAbsent(name, RegisterSingleton::new);
        return context.get(name);
    }
}
