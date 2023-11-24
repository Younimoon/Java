package com._03map.linkedhashmap;

import java.util.LinkedHashMap;

// 特点：有序，不重复，无索引
public class index {
    public static void main(String[] args) {

        // 创建集合
        LinkedHashMap<String, Integer> list = new LinkedHashMap<>();
        list.put("123", 123);
        list.put("1231", 1232);
        list.put("1232", 1213);

    }
}
