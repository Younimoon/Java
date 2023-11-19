package com.string的知识.stringjoiner的使用;

import java.util.StringJoiner;

public class index {
    public static void main(String[] args) {
        //StringJoiner是Java 8中添加的一个类，用于方便地拼接字符串。
        //它可以将多个字符串连接起来，可以指定分隔符、前缀和后缀。

        //创建一个StringJoiner对象，构造函数可以接受三个参数：
        //delimiter（可选）：指定字符串之间的分隔符。
        //prefix（可选）：指定拼接字符串的前缀。
        //suffix（可选）：指定拼接字符串的后缀。

        StringJoiner sj = new StringJoiner(", ", "[", "]");
        //使用StringJoiner的add()方法将字符串添加到拼接器中
        sj.add("apple");
        sj.add("banana");
        sj.add("cherry");
        System.out.println(sj.toString());

        // 也可以通过如下方式
        StringJoiner sj1 = new StringJoiner(", ");
        // setEmptyValue是输入默认值,一旦有值的输入就会消失
        sj1.setEmptyValue("我是你爸爸");
        System.out.println(sj1.toString());//我是你爸爸
        sj1.add("apple");
        sj1.add("banana");
        System.out.println(sj1.toString());// 输出 "apple, banana"

        int[] arr = {1, 2, 3, 4};
        // 注意:add传入的只能是string类型哦
        StringJoiner sj2 = new StringJoiner(", ","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj2.add(arr[i]+"");
        }
        System.out.println(sj2);
    }
}
