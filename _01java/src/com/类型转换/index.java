package com.类型转换;

public class index {
    public static void main(String[] args) {
        // 隐式转换（存在自动类型提升） ： 取值范围小的转化为取值范围大的
        // 强制转换： 上面取反
        // 自动类型提升：取值范围小的会自动提升到取值范围大的
        // 注意点：byte short char 三种数据类型在运算的时候都会直接先提升到int类型然后在进行计算

        // 取值范围排序： byte<short<int<long<float<double

        // 隐式转换，计算机自动实现
        int a = 10;
        double b = 2;
        double c = a + b;
        System.out.println(c);

        byte num = 10;
        byte num1 = 20;
        // num2 为int类型，byte类型会报错
        int num2 = num + num1;
        System.out.println(num2);

        int i = 10;
        long n = 100L;
        // 下面的数据类型是
        System.out.println(i + n + 20.0);

        // 强制转化
        // 格式：目标数据类型 变量名 = （目标数据类型）被强转的数据
        // 注意：可能发生错误（如下）
        int ab = 300;
        byte bc = (byte) ab;
        System.out.println("1111111" + bc);

        // 正确的
        byte abc = 10;
        byte cba = 123;
        //  如下错误
        //  byte result = (byte) abc + (byte) cba;
        byte result =(byte) (abc + cba);
        System.out.println(result);
        // 输出-123，造成的原因：需要转换的数据过大


    }
}




