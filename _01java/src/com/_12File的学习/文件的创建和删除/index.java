package com._12File的学习.文件的创建和删除;

import java.io.File;
import java.io.IOException;

public class index {
    public static void main(String[] args) throws IOException {
        // 创建一个空文件
        // 只能创建文件，不会创建文件夹
        File f1 = new File("D:\\aaaa-Java\\basiccode\\_01java\\src\\com\\_12File的学习\\文件的创建和删除");
        File f2 = new File(f1, "练习.txt");
        Boolean fy1 = f2.createNewFile();
        System.out.println(fy1);

        // 创建一个单级文件夹(上一层文件夹必须存在)
        File f3 = new File(f1, "文件夹创建");
        Boolean fy2 = f3.mkdir();
        System.out.println(fy2);

        // 创建多级文件
        File f4 = new File(f1, "文件夹创建\\aaa\\bbb\\ccc");
        Boolean fy3 = f4.mkdirs();
        System.out.println(fy3);

        // 只能删除文件或者空文件夹
        // 只能删除最里层的单层文件
        File f5 = new File(f1, "文件夹创建\\aaa\\bbb\\ccc");
        Boolean fy4 = f5.delete();
        System.out.println(fy4);

        // 获取并遍历
        // files为null的情况：f1的路径不存在或者f1的路径是文件
        // files为空数组的情况，f1代表空文件夹

        // 注意：当f1的路径是一个隐藏文件夹时，files里面包含隐藏文件夹
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
