package com.string的知识.初始string;

public class index {
    public static void main(String[] args) {
        // 字符串的定义格式
        String name = "黄";
        String Name = new String("huang");

        //传递一个字符数组，然后改成字符串
        char[] nameChar = {'h', 'w', 'p'};
        String name1 = new String(nameChar);

        // 传递一个字节数组,输出成字符串之前会通过asc码转译
        byte[] nameByte = {97, 98, 99};
        String name2 = new String(nameByte);

    }
}
