package com.gujiedmc.study.designpattern.composite;

//文本文件类：叶子构件
class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }
    @Override
    public void add(AbstractFile file) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void remove(AbstractFile file) {
        throw new UnsupportedOperationException();
    }
    @Override
    public AbstractFile getChild(int i) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void getInfo() {
        //模拟杀毒
        System.out.println("展示文本文件内容：" + name);
    }
}