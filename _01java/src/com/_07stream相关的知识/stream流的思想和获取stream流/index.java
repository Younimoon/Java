package com._07stream相关的知识.stream流的思想和获取stream流;


import java.util.*;
import java.util.stream.Stream;

// stream流的使用步骤
// 获取一个stream流
// 加工stream流
// 终结stream流
public class index {
    public static void main(String[] args) {
        // 获取stream流
        // 单列集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "s", "asd", "qwe");

        // 获取一道流水线，并且把数据放到流水线
        Stream<String> stream = list.stream();

        // 终结方法：打印一下
        stream.forEach(e -> System.out.println(e));


        // 双列集合
        // 无法直接使用stream流方法
        // 如果想使用，需要把类型转化为单列集合的，；一般就是转化为set的类型

        HashMap<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("ab", "1");
        map.put("ac", "1");
        map.put("ae", "1");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        entries.stream().forEach(e -> System.out.println(e));


        // 数组
        // 通过Arrays的静态方法转化为stream流
        String[] arr = {"1", "2", "4"};
        Arrays.stream(arr).forEach(e-> System.out.println(e));

        // 零散数据（同种类型）转化stream流

        Stream.of(1, 2, 34, 556, 5453).forEach(e -> System.out.println(e));
        Stream.of("a", "qwe", "sada").forEach(e -> System.out.println(e));

        // 传递的参数如果是一个数组，则必须是引用数据类型
        // 如果传递基本数据类型的数组，则会当成一个元素存放到stream当中
        Stream.of(arr).forEach(e -> System.out.println(e));
    }
}
