package com.接口的相关知识.接口的成员和接口的关系;

public class test1 {
    public static void main(String[] args) {
        // 可以直接访问接口的常量但是不能修改
        //inter.a = 2;
        System.out.println(inter.a);

        test Test = new test();
        Test.methods();
    }
}
