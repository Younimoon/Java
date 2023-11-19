package com.面向对象;

// 这就是一个javabean类
public class index {
    // 成员变量的格式
    // 修饰符（暂时不写） 数据类型 变量名 = 初始值（一般不定义，存在默认值）
    String name;
    int age;

    public void call() {
        System.out.println(name + "" + age);
    }
}