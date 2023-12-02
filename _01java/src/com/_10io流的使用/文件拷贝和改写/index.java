package com._10io流的使用.文件拷贝和改写;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class index {
    public static void main(String[] args) throws IOException {
        // 小文件的拷贝
        // 一个字节一个字节的拷贝，就是通过输入流的read方法获取一个字节文件流，写入到输出流
        // 创建对象

        FileInputStream fis = new FileInputStream("C:\\Users\\h\\Desktop\\病症文档.txt");
        FileOutputStream fos = new FileOutputStream("_01java\\copy1.txt");
        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }

        fos.close();
        fis.close();

        // 对于一个大体文件我们不建议使用一个字节一个字节的形式，我们更多采用字节数组的方式进行输入输出，但是不易过大，因为这是占用内存的

        // 创建一个存储两个字节的内存
        // 修改一次读取的字节大小 fis.read（byties）
        byte[] byties = new byte[2];

        FileInputStream fis1 = new FileInputStream("_01java\\copy.txt");
        FileOutputStream fos1 = new FileOutputStream("_01java\\copy2.txt");
        int length;
        while ((length = fis1.read(byties)) != -1) {
            fos1.write(byties,0,length);
            System.out.println(length);
            System.out.println(new String(byties, 0, length));
        }

        fos1.close();
        fis1.close();

    }
}
