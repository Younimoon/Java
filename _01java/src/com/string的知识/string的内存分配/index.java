package com.string的知识.string的内存分配;

public class index {
    public static void main(String[] args) {
        // 串池：直接赋值的字符串才会存放在这里面，
        // 注意：串池也是存在在堆里面的
        String name = "huang";

        // 通过new方式的创建的字符串存放在堆内存
        String Name = new String("huang ");

        // 直接赋值的字符串：如果变量a,变量b的变量值是相同,
        // b就不会在串池里面开辟新的空间，b会在栈里面直接存储a变量的地址
        // 但是如果一旦b的值被修改了且串池中没有相同的则会创建一个新的空间
        // 如
        String s1 = "abc";
        System.out.println(s1);
        String s2 = "abc";
        System.out.println(s2==s1);//true
        s2 = "cba";
        System.out.println(s2);
        System.out.println(s1==s2); //false

        // 通过new关键字进行赋值
        // 会直接在堆里面开辟空间，和普通的引用数据类型一样
        // 注意点：如下实例

        // char类型的数组是一个引用数据类型
        // 下面会先在堆里面创建一个空间（）空间内容就是{'1', '2', '3'}
        // 栈里面保存地址
        char[] char1 = {'1', '2', '3'};

        // 如下的在堆里面存储的是char1被编译成的字符串！
        // 不是我认为的char1的地址
        //num存储地址
        String num = new String(char1);
        String num1 = new String(char1);
        System.out.println(num==num1);//false

    }
}
