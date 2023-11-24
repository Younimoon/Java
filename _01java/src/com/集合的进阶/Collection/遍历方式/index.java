package com.集合的进阶.Collection.遍历方式;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class index {
    public static void main(String[] args) {
        // 迭代器遍历：是一个类叫iterator，是集合专用的遍历方式
        // 不依赖索引
        //相关的api
        // 创建一个迭代器对象 Iterator<E iterator()
        // 判断当前指向的位置是否存在元素  Boolean hasNext()
        // 获取当前指向的元素并且移动指针  E next()

        String[] str1 = {"1", "123123", "123123"};
        Collection<String> coll = new ArrayList<>(Arrays.asList(str1));
        coll.add("333333333");
        // 获取迭代器对象
        // 迭代器就好似一个箭头指向的是集合的0索引位置
        Iterator<String> it = coll.iterator();
        // 利用循环不断获取集合中的每一个元素
        while (it.hasNext()) {
            // next() 做了两件事
            // 获取当前元素 并且移动指针到下一个索引
            String str = it.next();
            System.out.println(str);
        }
        // 注意点：迭代器遍历结束了，指针不会复位
        System.out.println(it.hasNext());//false
        // 如果想再次迭代的话，需要重新获取迭代器
        // 循环中只能使用一次next方法
        // 迭代器遍历时不能使用集合的方法进行增删
        ;

    }
}
