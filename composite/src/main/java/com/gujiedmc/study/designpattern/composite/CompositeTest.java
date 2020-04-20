package com.gujiedmc.study.designpattern.composite;

/**
 * 组合模式测试
 *
 * @author gujiedmc
 * @date 2020/4/20
 */
public class CompositeTest {

    public static void main(String[] args) {

        AbstractFile folder1 = new Folder("gujiedmc的资料");
        AbstractFile folder2 = new Folder("文本文件");
        AbstractFile folder3 = new Folder("视频文件");

        AbstractFile file1 = new TextFile("Java入门.txt");
        AbstractFile file2 = new TextFile("Java劝退.doc");
        AbstractFile file3 = new VideoFile("从入门到跑路.avi");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder1.add(folder2);
        folder1.add(folder3);

        //从“gujiedmc的资料”节点开始进行杀毒操作
        folder1.getInfo();
    }
}
