package com.字符串和字符串加操作;

public class index {
    public static void main(String[] args) {
        // 只要存在字符串都会进行字符串的拼接

        // 和js类似,从左到右依次计算
        System.out.println("中级" + "123" + true);

        // 字符相加 字符会通过asc码查询字符对应的数字进行计算
        char a = 'a';
        int b = 20;
        System.out.println(a + b);
        System.out.println('a'+"123");
    }
}
