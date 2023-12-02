package com._12File的学习.file常见的成员方法;

import java.io.File;

public class index {
    public static void main(String[] args) {
        // 判断文件夹是否存在
        File f1 = new File("D:\\aaaa-Java\\basiccode\\_01java\\src\\com\\_12File的学习\\file常见的成员方法\\练习.txt");
        Boolean yf1 = f1.isDirectory();
        System.out.println(yf1);

        // 判断文件是否存在
        Boolean fy2 = f1.isFile();
        System.out.println(fy2);

        // 判断路径名表示的File是否存在
        Boolean yf3 = f1.exists();
        System.out.println(yf3);

        // 获取文件大小 默认字节：字节
        Long size = f1.length();
        System.out.println(size);

        // 文件的绝对路径
        String src = f1.getAbsolutePath();
        System.out.println(src);

        // 获取文件名称
        String name = f1.getName();
        System.out.println(name);

        // 返回文件最后一次修改时间
        Long lastModefied = f1.lastModified();
        System.out.println(lastModefied);

    }
}
