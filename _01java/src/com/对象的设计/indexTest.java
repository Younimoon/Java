package com.对象的设计;

public class indexTest {
    public static void main(String[] args) {
        // 可以理解是通过new实例化了一个对象
        index test = new index(20,"黄威鹏");
        test.getAge();
        System.out.println(test.name+"name");
        // 这里的test就是index类中的this
        System.out.println(test);
    }
}
