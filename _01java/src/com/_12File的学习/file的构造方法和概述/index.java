package com._12File的学习.file的构造方法和概述;

import java.io.File;

public class index {
    public static void main(String[] args) {

        //1 public File(String name) 根据文件路径创建文件对象
        String src = "D:\\aaaa-Java\\basiccode\\_01java\\src\\com\\_12File的学习\\练习.txt";
        File f1 = new File(src);
        System.out.println(f1);
        //2 public File(String parent,String child) 根据父路径名字字符串和子路径名字符串创建文件对象
        // 父级路径：D:\aaaa-Java\basiccode\_01java\src\com\_12File的学习
        // 子级路径：练习.txt

        String parent = "D:\\aaaa-Java\\basiccode\\_01java\\src\\com\\_12File的学习";
        String child = "练习.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

        //3 public File(FIle parent, String child) 根据父路径对应文件对象的子路径名 字符串创建文件对象昂

        File f4 = new File("D:\\aaaa-Java\\basiccode\\_01java\\src\\com\\_12File的学习");
        String child2 = "练习.txt";
        File f5 = new File(f4, child2);
        System.out.println(f5);

    }
}
