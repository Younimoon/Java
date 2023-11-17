package com.循环判断语句;

import java.util.Scanner;

public class index2 {
    public static void main(String[] args) {
        // if判断语句：如果执行体的代码只有一句可以省略{}

        //例子
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if (money > 100) System.out.println("吃大餐了哦");
        else System.out.println("随便吃吃");


        // switch语句
        switch (money) {
            case 1:
                System.out.println("我就算哦");
                break;
            default:
                System.out.println("就这样把");
                break;
        }
        // switch的省略写法省略break
        switch (money) {
            // money等于1或者2或者3的时候
            case 1, 2, 3 -> System.out.println("我就算哦");
            default -> System.out.println("111");
        }

        // while循环的例子，回环数
        System.out.println("请输入一个数");
        int Number = sc.nextInt();
        int num = 0;
        int x = Number;
        while (Number != 0) {
            int Y = Number % 10;
            Number = Number / 10;
            num = Y + num * 10;
        }
        System.out.println(num);
        if(num == x) System.out.println("这是回环数");
        //do while循环
    }
}
