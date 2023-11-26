package com._09方法引用.引用数组的构造方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntFunction;

public class index {
    public static void main(String[] args) {
        //格式：数据类型[]::new
        // int[]::new


        //例子：集合中存储一些整数，收集到数组当中
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 4, 2, 234, 2, 4, 34, 2341);

        //收集到数组当中
        Integer[] list1 = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        //引用数组的构造方法
        Integer[] list2 = list.stream().toArray(Integer[]::new);
        System.out.println(list2);
        System.out.println(list1);
    }
}
