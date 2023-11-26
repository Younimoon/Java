package com._07stream相关的知识.stream流的终结方法;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

// 使用了终结方法后，就不能在这条链上使用其他的方法
public class index {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "34");
        //foreach遍历
        // count 统计
        long sie = list.stream().count();
        System.out.println(sie);

        // toArray 收集流中的数据，放到数组
        // 空参
        Object[] arr = list.stream().toArray();
        System.out.println(Arrays.toString(arr));
        // 有参
        // 参数的作用：负责创建一个指定类型的数组
        list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        // collect 收集流中的数据，放到集合中
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "ab-男-12", "ac-女-12", "aa-女-15", "ae-男-12", "aa-男-12", "aa-男-12");
        System.out.println(list1);
        // 将所有男性收集到一个list集合当中
        List<String> stu = list1.stream().filter(e -> e.contains("男")).collect(Collectors.toList());
        System.out.println(stu);
        // 将所有男性收集到一个set集合当中
        // 乱序，不重复的
        Set<String> stu1 = list1.stream().filter(e -> e.contains("男")).collect(Collectors.toSet());
        System.out.println(stu1);


        //收集到map集合
        // 条件男性
        // 键:姓名
        // 值：性别
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "ab-男-12", "ac-女-12", "aa-女-15", "ae-男-12");
        Map<String, String> map = list2.stream().filter(e -> e.contains("男")).collect(Collectors.toMap((s) -> s.split("-")[0], (s) -> s.split("-")[1]));
        System.out.println(map);

    }
}
