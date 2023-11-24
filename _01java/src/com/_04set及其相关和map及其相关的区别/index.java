package com._04set及其相关和map及其相关的区别;

import java.util.*;
//List 和 Set 都继承自 collection 接口，Map 则不是。

//List 集合中对象按索引位置排序，可以有重复对象，
// 允许按照对象在集合中的索引位置检索对象，例如可以通过 list.get(i)方法来获取集合中的元素；

//Map 中的每一个元素包含一个键和一个值，成对出现，
// 键对象不可以重复，值对象可以重复 Set 集合中的对象不按照特定的方式排序，
// 并且没有重复对象，但它能对集合中的对象按照特定的方式排序，例如 TreeSet 类。


// set list 都是继承接口Collection的接口
public class index {
    public static void main(String[] args) {

        // 单列集合：Collection

        // list的实现类
        // ArrayList是list接口的实现类
        // ()空参构造
        List<String> a = new ArrayList<>();
        // LinkedList是list接口的实现类
        List<String> b = new LinkedList<>();

        // set有下面三种实现类
        Set<String> c = new HashSet<>();
        Set<String> d = new TreeSet<>();
        Set<String> e = new LinkedHashSet<>();

        // 双列集合 ：map
        // 下面是map结合的三种实现类
        Map<String, String> f = new HashMap<>();
        Map<String, String> g = new TreeMap<>();
        Map<String, String> h = new LinkedHashMap<>();
    }
}
