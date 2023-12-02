package com._12File的学习.例子;

import java.io.File;

public class index {
    public static void main(String[] args) {
        // 定义一个方法，找是否存在以avi结尾的电影(没有子文件的情况下)
        File f1 = new File("D:\\aaaa-Java\\basiccode\\_01java\\src\\com\\_12File的学习\\文件的创建和删除");
        Boolean isTrue = getMove(f1);
        System.out.println(isTrue);
    }

    static Boolean getMove(File f) {
        File[] files = f.listFiles();
        System.out.println(files);
        for (File file : files) {
            String name = file.getName();
            if (name.contains(".")&&name.split("\\.")[0]=="avi") {
                return true;
            }
        }
        return false;
    }
}
