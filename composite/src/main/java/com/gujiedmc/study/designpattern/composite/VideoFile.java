package com.gujiedmc.study.designpattern.composite;

//视频文件类：叶子构件
class VideoFile extends AbstractFile {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }
    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }
    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }
    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }
    @Override
    public void getInfo() {
        System.out.println("展示视频内容：" + name);
    }
}