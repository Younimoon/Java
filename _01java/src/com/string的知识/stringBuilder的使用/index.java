package com.string的知识.stringBuilder的使用;

public class index {
    public static void main(String[] args) {
        // stringBuilder是一个类:可以看成是一个容器。创建之后容器内部的内容是可变的
        // 可以通过这个类的方法对字符串进行操作
        // 作用：提高字符串的操作效率
        StringBuilder name = new StringBuilder("huangweipeng");


        //append(String str): 将指定的字符串追加到当前字符串的末尾。
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString()); // 输出 “Hello World”

        //insert(int index, String str): 在指定的位置插入字符串。
        StringBuilder sb1 = new StringBuilder("Hello");
        sb.insert(5, " World");
        System.out.println(sb.toString()); // 输出 “Hello World”

        //delete(int start, int end): 删除指定范围内的字符。
       StringBuilder sb2 = new StringBuilder("Hello World");
        sb.delete(5, 11);
        System.out.println(sb2.toString()); // 输出 “Hello”

        //replace(int start, int end, String str): 替换指定范围内的字符为指定的字符串。
        StringBuilder sb3 = new StringBuilder("Hello World");
        sb.replace(6, 11, "Java");
        System.out.println(sb3.toString()); // 输出 “Hello Java”

        //reverse(): 反转当前字符串。
        StringBuilder sb4 = new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb4.toString()); // 输出 “olleH”


    }
}
