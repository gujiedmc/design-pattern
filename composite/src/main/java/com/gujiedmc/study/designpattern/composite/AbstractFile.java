package com.gujiedmc.study.designpattern.composite;

/**
 * 文件类型
 */
abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void getInfo();
}