package com._09方法引用.引用静态方法;


import java.util.ArrayList;
import java.util.Collections;

// 格式
// 类名：：静态方法
public class index {
    public static void main(String[] args) {
        //将"1","2","4" 转化成数字

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "4", "2", "56");

        //list.stream().map(e -> Integer.parseInt(e));
        list.stream().map(index::parseint).forEach(e -> System.out.println(e));

        // Integer里面本身就存在这样一个方法parseInt
        list.stream().map(Integer::parseInt).forEach(e -> System.out.println(e));

    }


    static int parseint(String e) {
        return Integer.parseInt(e);
    }
}
