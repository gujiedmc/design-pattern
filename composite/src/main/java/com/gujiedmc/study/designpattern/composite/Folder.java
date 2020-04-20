package com.gujiedmc.study.designpattern.composite;

import java.util.ArrayList;

/**
 * 文件夹
 */
class Folder extends AbstractFile {

    private ArrayList<AbstractFile> fileList= new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }
    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }
    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }
    @Override
    public void getInfo() {
        System.out.println("文件夹'" + name + "'下的内容");

        //递归调用成员构件的getInfo()方法
        for(AbstractFile obj : fileList) {
            obj.getInfo();
        }

        System.out.println("文件夹'" + name + "'下的内容结束");
    }
}