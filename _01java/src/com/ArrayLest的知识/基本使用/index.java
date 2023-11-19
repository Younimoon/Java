package com.ArrayLest的知识.基本使用;

import java.util.ArrayList;
import java.util.Iterator;

public class index {
    public static void main(String[] args) {
        //集合:自动扩容
        // 集合不能直接存储基本数据类型,只有转换其包装类才可以

        //集合和数组的对比
        // 数组的长度的固定的,集合的长度是可变的

        //集合有很多:先学习aArraylist集合
        //api就是包括增删改查
        //创建 ArrayList 对象：
        // 增：add  删：remove 改；get 查：size：查询长度 get：获取对应的元素
        ArrayList<String> list = new ArrayList<String>();
        //添加元素到 ArrayList：

        list.add("apple");
        list.add("banana");
        list.add("cherry");

        System.out.println(list);
        //获取 ArrayList 的大小（元素个数）：
        int size = list.size();
        System.out.println(size);

        //获取指定位置的元素：
        String element = list.get(1); // 获取索引为 1（第二个元素）的元素

        //修改指定位置的元素：
        list.set(0, "orange"); // 将索引为 0（第一个元素）的元素替换为 "orange"

        //删除指定位置的元素：
        list.remove(2); // 删除索引为 2（第三个元素）的元素
        //检查 ArrayList 是否包含某个元素：
        boolean contains = list.contains("apple");

        //在指定位置插入元素：
        list.add(1, "grape"); // 在索引为 1 的位置插入元素 "grape"

        //清空 ArrayList 中的所有元素：
        list.clear();

        //判断 ArrayList 是否为空：
        boolean isEmpty = list.isEmpty();
        //遍历 ArrayList：

        //使用 for 循环：

        for (int i = 0; i < list.size(); i++) {
            String element1 = list.get(i);
            System.out.println(element1);
        }

        //使用增强型 for 循环：
        for (String element2 : list) {
            System.out.println(element2);
        }

        //使用迭代器：
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element3 = iterator.next();
            System.out.println(element3);
        }
    }
}
