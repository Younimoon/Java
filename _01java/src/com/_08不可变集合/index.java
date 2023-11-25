package com._08不可变集合;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class index {
    public static void main(String[] args) {
        // 创建一个不可改变的结合

        // 创建方法
        // List.of
        List<String> list = List.of("a", "b", "c");

        // Set.of
        // 创建一个不可变的set集合时需要里面的值是唯一的
        // 报错
        //Set<String> set = Set.of("a", "b", "c","b");
        Set<String> set = Set.of("a", "b", "c");
        System.out.println(set);

        // Map.of
        // 注意：每两个参数是一个键值对
        // 前一个是键，后一个是值
        // 键不能重复
        // map.of最多存储10个键值对，20个参数（一个键值对就是2个参数）

        Map<String, Integer> map = Map.of("h", 1, "b", 2);

        // 遍历都支持
        // for循环遍历，迭代器遍历，foreach遍历

        // 删除
        // 报错
        //list.remove("a");
        //list.add("aec");
        //list.set(1, "123");
        System.out.println(list);
    }
}
