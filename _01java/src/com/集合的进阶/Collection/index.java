package com.集合的进阶.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Collection接口的子接口包括：Set接口和List接口
//Set接口的实现类主要有：HashSet、TreeSet、LinkedHashSet等
//List接口的实现类主要有：ArrayList、LinkedList、Stack以及Vector等

//  ArrayList是List的具体实现之一，通过实例化ArrayList对象，
//  我们可以使用List接口中定义的方法来操作列表中的元素。
public class index {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("12312312"));
        System.out.println(list);

    }
}
