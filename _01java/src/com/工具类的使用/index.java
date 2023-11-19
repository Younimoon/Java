package com.工具类的使用;

// 帮助我们做一些事情，而不是描述事物的类
// 哪里需要工具就使用，
// 就相当于一个封装的多函数集合，里面自定义很多函数
// 类名必须见名知意
// 私有化构造方法
// 方法定义为静态的
public class index {
    public static void main(String[] args) {
        int number = Mutils.add(1, 2);
        System.out.println(number);
    }
}
 class Mutils {
    // 私有化构造函数
     // 目的：防止外界创建他的实例
    private Mutils() {


    }

    public static int add(int a, int b) {
        return a + b;
    }

}