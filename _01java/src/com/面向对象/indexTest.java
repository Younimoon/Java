package com.面向对象;

// 里面由main函数是一个测试类
public class indexTest {
    public static void main(String[] args) {
        // new一个index类
        index i = new index();
        // 对其进行赋值
        i.age = 12;
        i.name = "Huangweipemng";
        System.out.println(i.age + "" + i.name);
        i.call();
    }
}


