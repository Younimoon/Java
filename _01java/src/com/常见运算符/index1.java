package com.常见运算符;

import java.util.Scanner;

public class index1 {
    public static void main(String[] args) {
        // ++和--
        // a++ 和++a单独写一行时后一行输出的结果都是一样的
        // 只要不在同一行进行操作和使用，在后面行数使用都是操作完成之后的变量
        int a = 10;
        a++;
        System.out.println(a);
        --a;
        System.out.println(a);

        // 比较麻烦的
        // 先用后操作
        int ab = 10;
        int c = ab++;
        System.out.println(c);

        // 先操作后用
        int cd = 10;
        int de = ++cd;
        System.out.println(de);

        // 赋值运算符
        int n = 10;
        int m = 20;
        n += m;
        // 30
        System.out.println(n);
        // 20
        System.out.println(m);

        // 细节：+=,-=,%=,/=的底层都隐藏了一个强制转换
        short num = 1;
        num += 1;
        // 不等同于 num=num+1
        // 等同于num = （short）（num+1）
        System.out.println(num);


        //3.关系运算符
        // == <= >= < > !=
        if (num > 10) {
            System.out.println("我是你业余");
        } else {
            System.out.println("我是你八佰伴");
        }

        // 4.逻辑运算符
        // & 且 | 或 ^异或 ！非
        // 异或：相同为假。不同为真
        System.out.println(false ^ false);
        System.out.println(false ^ true);

        // 4. 短路运算符 （当运算符左边的已经知道结果，就不会去判断右边，节省开发效率）
        // && 与短路运算符   || 或短路运算符
        // （a && b）
        // 如果a为false则直接返回false，不会对b进行判断
        // （a || b ）
        //  如果a为true则直接返回true，不会对b进行判断
        int Num1 = 10;
        int Num2 = 20;
        boolean result = ++Num1 < 10 && ++Num2 > 20;
        //且的操作一假就假 因为++Num1<10为假所以直接对++Num2不进行操作
        System.out.println(Num2);
        System.out.println(result);
        boolean Result = ++Num1 > 10 || ++Num2 > 20;
        //或的操作一真就真 因为++Num1<10为真所以直接对++Num2不进行操作
        System.out.println(Num2);
        System.out.println(Result);


        // 例子输入数字判断是否是6的倍数
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int Number = sc.nextInt();
        if (number == 6 || Number == 6 || (number + Number) % 6 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // 三元运算符和运算符的优先级(先乘除后加减)问题
        int numa = 150;
        int numb = 120;
        int numc = 170;
        int max = numa > numb ? numa : numb;
        max = max > numc ? max : numc;
        System.out.println(max);
    }
}
