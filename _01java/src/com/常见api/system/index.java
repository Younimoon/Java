package com.常见api.system;

import java.util.Arrays;
import java.util.Scanner;

//System是一个预定义的类，它提供了访问标准输入、标准输出和错误流的方法，以及其他与系统相关的功能。
public class index {
    public static void main(String[] args) {

        //使用System.out打印输出：
        System.out.println("Hello, World!");

        //使用System.err打印错误信息：
        System.err.println("Error occurred!");

        //使用System.in从控制台读取输入：
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        //使用System.currentTimeMillis()计算代码执行时间：
        long startTime = System.currentTimeMillis();

        // 执行一些耗时操作
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Code execution time: " + elapsedTime + " milliseconds");

        //使用System.arraycopy()进行数组复制：
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destArray = new int[sourceArray.length];

        // 参数：第一个：需要拷贝的数组来源
        // 第二个：数组来源从哪个位置开始拷贝
        // 第三个：拷贝到的地方
        // 第四个：拷贝到的数组的开始索引,第五个：拷贝过去的长度
        // 深拷贝
        System.arraycopy(sourceArray, 0, destArray, 0, sourceArray.length);
        System.out.println(Arrays.toString(destArray)); // 输出：[1, 2, 3, 4, 5]
        System.out.println(sourceArray);
        System.out.println(destArray);


        //使用System.exit()退出程序：
        System.out.println("Before exit");
        System.exit(0);
        System.out.println("After exit"); // 不会执行到这里
    }
}


