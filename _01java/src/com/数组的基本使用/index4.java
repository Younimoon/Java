package com.数组的基本使用;

import java.util.Arrays;

public class index4 {
    public static void main(String[] args) {
        // 数组可以存储同种数据类型的多个值，需要结合隐式转换考虑
        // int类型的数组只能存放int 和 byte 和chort的数据类型
        // double数据类型的数据可以存放所有数字的数据类型

        // 定义一个数组会为数组开辟一定的空间

        // 直接打印数据是打印的数组的地址
        // 完整格式
        int[] arr2 = new int[]{1, 2, 10};
        System.out.println(Arrays.toString(arr2));

        // 定义数组(简写)
        int[] arr = {1, 2, 345, 56};
        System.out.println(arr);

        double arr1[] = {1.1, 11, 21312312, 3213};
        System.out.println(arr1[1]);
        // 输出[I@4eec7777
        // [ 代表是是数组 I 代表的是数据类型：这里表示为int @ 代表间隔符无实际意义 剩下的就算地址值

        // 修改数组内容
        System.out.println(arr1[3]);
        arr1[3] = 1.234;
        // 覆盖后原来的数据就不存在了
        System.out.println(arr1[3]);

        // 利用循环打印变量并且累加求和
        double sum = 0.0;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);

        // char字符数据类型的初始化值是"/0000" 空格
        // 布尔的初始化值是false
        // 数组的动态初始化：定义数组的长度，初始值由系统分配
        // 数字类型的初始值要么0 要么0.0
        // 格式
        double[] arr4 = new double[5];
        System.out.println(Arrays.toString(arr4));

        // string的初始化值是null
        String[] stu = new String[5];
        stu[0] = "huang";
        stu[1] = "huang";
        stu[2] = "huang";
        stu[3] = "huang";
        //stu[4] = "huang";
        System.out.println(Arrays.toString(stu));

        //数组常见问题
        //索引越界：索引大于了数组的最大索引

        // eg 判断数组的最大值
        int max = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max) max = arr2[i];
        }
        System.out.println(max);
        //int random =(int) Math.random();
        // 随机生成一个1-100的数
        // Math.random() （0，1）的开区间
        int random = (int) (Math.random() * 100 + 1);
        System.out.println("随家属" + random);

        // 在Arr中存10个1-100的随机数，把小于平均数的元素打印出来
        int[] Arr = new int[10];
        for (int i = 0; i < 10; i++) {
            Arr[i] = random;
        }
        double Sum = 0;
        for (int i = 0; i < Arr.length; i++) {
            //Arr[i] = random;
            Sum += Arr[i];
        }
        System.out.println(Sum);
        double pinjun = Sum / Arr.length;
        System.out.println("平均值" + pinjun);

        // 例子：数组对称位置的元素进行数据交换
        int[] Arr1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < (int) Arr1.length / 2; i++) {
            int mid = 0;
            System.out.println(Arr1[i] + "11111111" + Arr1[Arr1.length - i - 1]);
            mid = Arr1[i];
            Arr1[i] = Arr1[Arr1.length - i - 1];
            Arr1[Arr1.length - i - 1] = mid;
        }
        System.out.println(Arrays.toString(Arr1));
    }
}
