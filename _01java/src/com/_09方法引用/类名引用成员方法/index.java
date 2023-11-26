package com._09方法引用.类名引用成员方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class index {
    public static void main(String[] args) {
        //格式： 类名：成员方法

        // 例子：在集合中的一系列字符串，变成大写进行输出

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "a", "q", "das", "qe");
        list.forEach(String::toUpperCase);
        List<String> list1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list);
    }
}
