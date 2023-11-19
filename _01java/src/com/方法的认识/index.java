package com.方法的认识;

import java.util.Arrays;

public class index {
    public static void main(String[] args) {
        // 方法是程序最小的 ！！执行 ！！单元
        int max = max(10, 20);
        int[] Arr = {1, 2, 3, 5, 6,};
        // 将数组直接作为参数的技巧
        int[] arr = copyArr(new int[]{1, 2, 3, 5, 6,}, 2, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println(max);

        int num = 21;
        change(num, Arr);
        System.out.println("num" + num);
        System.out.println(Arrays.toString(Arr));
    }

    // 方法名习惯使用小驼峰的表示:"setName"
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    // 方法的重载：在同一个类中定义多个同名的方法，这些同名的方法就有同种的功能
    // 每个方法具有不同的参数类型或参数个数，这些同名的方法，就构成了重载
    // 简单记忆：同一个类下面，方法名相同，参数不同，与返回值无关
    // 参数不同代表：个数不同，类型不同，顺序不同满足一个就可以

    // java虚拟机会根据不同的参数来区分同名的方法并且进行对应方法的调用
    public static double max(double a, int b) {
        return a > b ? a : b;
    }
    //如果你调用max方法时传递的是int型参数，则 int型参数的max方法就会被调用；
    //如果传递的是double型参数，则double类型的max方法体会被调用，这叫做方法重载；
    //就是说一个类的两个方法拥有相同的名字，但是有不同的参数列表。
    //Java编译器根据方法签名判断哪个方法应该被调用。
    //方法重载可以让程序更清晰易读。执行密切相关任务的方法应该使用相同的名字。
    //重载的方法必须拥有不同的参数列表。你不能仅仅依据修饰符或者返回类型的不同来重载方法。

    // 例子定义一个方法将参数（arr,from,to）将arr中的from到to的元素写入新数组
    public static int[] copyArr(int[] arr, int from, int to) {
        int[] Arr = new int[to - from];
        int j = 0;
        for (int i = from; i < to; i++) {
            Arr[j] = arr[i];
            j++;
        }
        return Arr;
    }

    // 基本数据类： 整数类型，浮点数类型，布尔类型，字符类型
    // 基本数据类型直接存储于栈里
    // 引用数据类型的变量名和数据类型还有地址存在于栈，只有变量值位于堆
    // 方法运行时的内存：从上往下的运行机制和js差不多

    //例子
    public static void change(int num, int[] arr) {
        // 将数据作为参数传递到一个函数中修改参数
        // 在原来的数据中是不会改变的，但是引用数据类型会发生改变

        // 因为通过参数传递过来就相当于赋值，基本数据类型直接开辟空间接收相同的数据
        // 引用数据类型就是开辟空间接收相同的地址
        num = 20;
        arr[0] = 11;

    }

}

