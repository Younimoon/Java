package com.string的知识.字符串的比较;

public class index {
    public static void main(String[] args) {
        //直接创建字符串和new出来的字符串的比较
        //会忽略创建方式的比较
        //
        String s1 = "huang";
        String s2 = new String("Huang");
        String s3 = new String("huang");
        //equals:比较两个字符串，只有字符串的内容一模一样才会为true（区分大小写）
        System.out.println(s2.equals(s1));//false
        System.out.println(s1.equals(s3));//true


        //忽略大小的比较
        System.out.println(s2.equalsIgnoreCase(s3));//true


    }
}
