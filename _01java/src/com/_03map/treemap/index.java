package com._03map.treemap;

import java.util.Comparator;
import java.util.TreeMap;

// 底层和treeset一样
// 由键决定：不重复，无索引，可排序
// 排序可重写， 和treeset的重写一样
// 默认会按照key（key为Integer或者double类型）的升序进行排列
// string类型按照asc码升序
public class index {
    public static void main(String[] args) {
        // 根据id进行排序

        TreeMap<String, Integer> list = new TreeMap<>(new Comparator<String>() {
            @Override
            // 这里的o1,o2都是key的值
            public int compare(String o1, String o2) {
                System.out.println(o1 + "111111111----" + o2);
                return 0;
            }
        });
        list.put("黄1", 123);
        list.put("黄2", 12);
        list.put("黄3", 13);
        System.out.println(list);

    }
}

