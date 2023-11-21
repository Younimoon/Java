package com.ArrayLest的练习;

import java.util.ArrayList;
import java.util.Arrays;

public class index {
    // <>的类型只能是引用数据类型
    public static void main(String[] args) {
        String[] str = {"1","123123","123123"};
        // 数组里面存在元素
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
        // 也可以如下
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("1","2","123"));

        System.out.println(list);
        System.out.println(list1);
    }
}
