package com._01树的数据结构.stream流的例子;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class index {
    public static void main(String[] args) {
        // 例子1：定义一个集合添加整数
        // 过滤奇数，只留下偶数

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 67, 23, 8, 12, 45, 17, 321);
        List<Integer> list1 = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);

        //例子2 创建一个集合（list） 并添加字符串，字符串格式为 name-age
        // 条件：保留大于等于24岁的并且收集到map集合中，键：name，值：age

        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "zhangsan-12", "lisi-24", "wangwu-10", "wangwul-18", "wangwui-20");
        Map<String, String> map = list3.stream().filter(e -> Integer.parseInt(e.split("-")[1]) > 15).collect(Collectors.toMap(e -> e.split("-")[0], e -> e.split("-")[1]));
        System.out.println(map);

        // 例子3. 创建两个集合，第一个：存储6名男演员的名字和年龄，第二个集合：存储6名女演员的名字和年龄
        //名字和年龄的表达方式：name,age

        //TreeSet<String> man_Actors = new TreeSet<>(new Comparator<String>() {
        //    @Override
        //    public int compare(String o1, String o2) {
        //        System.out.println(o1 + "-qweqweewq" + o2);
        //        return o1.split(",")[1].length() - o2.split(",")[0].length();
        //    }
        //});
        ArrayList<String> man_Actors = new ArrayList<>();
        Collections.addAll(man_Actors, "黄1,21", "黄12,24", "黄4,12", "黄34,23", "黄2,43", "黄5,10", "45,79", "黄6,20");
        ArrayList<String> woman_Actors = new ArrayList<>();
        Collections.addAll(woman_Actors, "威鹏1,23", "威鹏12,22", "威鹏4,10", "鹏34,56", "威鹏23,45", "威鹏5,76", "威鹏45,78", "威鹏6,40");

        // 条件：男演员三个字的排前面
        man_Actors.stream().filter(e -> {
            if (e.split(",")[0].length() == 3) {
                return true;
            }
            return false;
        }).limit(2).forEach(e -> System.out.println(e));

        //女演员只要姓威的，并且不要第一个姓威的
        woman_Actors.stream().filter(e -> e.startsWith("威")).skip(1).forEach(e -> System.out.println(e));

        // 把过滤之后的进行合并
        Stream<String> woman = woman_Actors.stream().filter(e -> e.startsWith("威")).skip(1);
        Stream<String> man = man_Actors.stream().filter(e -> {
            return e.split(",")[0].length() == 3;
        }).limit(2);
        Stream<String> concat = Stream.concat(woman, man);

        //将合并后的每个元素封装成一个actor对象
        Stream<Actor> actors = concat.map(e -> new Actor(e.split(",")[0], Integer.parseInt(e.split(",")[1])));

        // 将上述的演员对象保存到list集合当中
        ArrayList<Actor> arr = new ArrayList<>();
        actors.forEach(e -> arr.add(e));
        System.out.println(arr);

    }
}

class Actor {
    private String name;
    private int age;

    public Actor() {
    }

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Actor{name = " + name + ", age = " + age + "}";
    }
}