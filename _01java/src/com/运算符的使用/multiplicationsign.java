package com.java的基础语法学习;

import java.util.Scanner;

public class multiplicationsign {
    public static void main(String[] args) {
        // 在代码中有小数参与计算，计算结果是有可能不精确的
        System.out.println(1.0 + 1.01);
        // 下面两个的代码的执行结果会不一样，就是因为有小数参与
        System.out.println(10.0 / 3);
        System.out.println(10 / 3);

        System.out.println(10 % 3);
        System.out.println(10.0 % 3);

        // 例子：将键盘输入的多位数分别输出
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number / 100);
        System.out.println(number / 10 % 10);
        System.out.println(number % 100 % 10);
    }
}
