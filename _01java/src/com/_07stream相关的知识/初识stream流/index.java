package com._07stream相关的知识.初识stream流;

import java.util.ArrayList;
import java.util.stream.Stream;

public class index {
    public static void main(String[] args) {
        // 把所有姓张的存储到新的集合
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add("张三");
        list.add("张四");
        list.add("张五");
        list.add("李三");
        list.add("李四");
        list.add("李五");
        list.forEach(e->{
            if (e.startsWith("张")) {
                list1.add(e);
            }
        });
        System.out.println(list1);

        // 把张开头的长度为2的存在新数组
        ArrayList<String> list2 = new ArrayList<>();
        list1.forEach(e->{
            if (e.length()==2){
                list2.add(e);
            }
        });
        System.out.println(list2);


        // 通过stream流实现

        Stream<String> list4 =   list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 2);
        //System.out.println(list4);
        list4.forEach(e->{
            System.out.println(e);
        });
    }
}
