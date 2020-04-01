package com.gujiedmc.study.factory.product;

/**
 * 苹果智能手机
 */
public class ApplePhone implements Phone{

        @Override
        public void start() {
            System.out.println("苹果手机开机");
        }
    }