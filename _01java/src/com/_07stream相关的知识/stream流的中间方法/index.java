package com._07stream相关的知识.stream流的中间方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class index {
    public static void main(String[] args) {
        // 注意：中间方法，返回的是新的stream流，原来是stream流只能使用一次，建议使用链式操作
        // 注意：只有用变量接收返回值的stream流才能使用一次
        // 如果是链式创建stream流并且操作，这种可以无数次，且不会被认为stream流被使用过

        // 如下就是例子：下面打印均可成功
        //list1.stream().limit(4).forEach(e -> System.out.println(e));
        //list1.stream().limit(4).forEach(e -> System.out.println(e));
        //Stream<String> a = list1.stream();
        //a.forEach(e -> System.out.println(e));

        // 修改stream流的数据不会修改原集合或原数组的数据

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("4");
        list.add("5");
        list.add("23");

        // 过滤
        Stream<String> stream = list.stream();
        System.out.println(stream);
        Stream<String> filter = stream.filter(e -> e != "1");
        filter.forEach(e -> System.out.println(e));

        // 因为来源的stream流只能使用一次，所以如下会报错
        //stream.filter(e -> e == "2");


        // 因为filter被使用过了所以报错
        //Stream<String> limit = filter.limit(4);
        // limit 获取前几个元素
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "2", "4", "4", "234");

        list1.stream().limit(4).forEach(e -> System.out.println(e));
        // Stream<String> a = list1.stream();
        // a.forEach(e -> System.out.println(e));

        // skip方法 跳过前几个元素
        list1.stream().skip(1).forEach(e -> System.out.println("skip" + e));

        // distinct 元素去重，（依赖于hashcode 和 equals方法
        //  所以如果元素数据是对象类型，需要手动重写


        // cancat合并两个流，尽量让数据类型一致
        // 为stream的静态方法
        Stream.concat(list1.stream(), list.stream()).forEach(e -> System.out.println(e));

        // map:类型转换
        // map不值用于类型转化，他的内部可以写自己的逻辑
        // 但是必须有返回值
        list1.stream().map(e -> {
            String[] arr = e.split("");
            String str = arr[0];
            int age = Integer.parseInt(str);
            return age;
        }).forEach(e -> System.out.println(e));



    }
}
