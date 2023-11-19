package com.内存分配问题;

public class index5 {
    public static void main(String[] args) {
        //java的内存分配：
        // 运行时是在栈完成的

        // 1.栈：方法运行时使用的内存：比如main方法运行
        // 2. 堆：new来创建的都存储在堆内存（开辟空间存在地址）

        // 和js差不多栈存储堆中的地址

        int[] arr1 = {1, 1, 2};
        // 因为arr1表示的就是一个地址，所以直接赋值是将地址赋值给arr2
        int[] arr2 = arr1;
        arr2[0] =20;
        System.out.println(arr2[0]);
        System.out.println(arr1[0]);
    }
}
