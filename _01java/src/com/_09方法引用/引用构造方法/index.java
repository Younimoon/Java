package com._09方法引用.引用构造方法;

// 类名：：new

// 细节：我们引用的方法的参数必须和原来的函数式接口的参数一致

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class index {
    public static void main(String[] args) {
        // 案例 创建一个类的对象
        // 条件：集合中存储姓名和年龄。封装成student对象并收集到list集合当中
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "黄轩-22", "张轩-22", "李旭那-22", "黄阿斯达-22", "阿达水水轩-22", "黄企鹅轩-22");
        //封装成student对象并收集到list集合当中

        List<stu> stuList = list.stream()
                .map(e -> new stu(e.split("-")[0], Integer.parseInt(e.split("-")[1])))
                .collect(Collectors.toList());

        // 通过方法引用进行改写

        // list.stream()
        //        .map(new Function<String, Object>() {
        //            @Override
        //            public stu apply(String s){
        //                return new stu(s.split("-")[0], Integer.parseInt(s.split("-")[1]));
        //            }
        //        })
        //        .collect(Collectors.toList());

        // new代表的是构造函数，但是构造函数没有只有一个参数的
        // 我们的map的接口实现就只需要穿一个参数
        // 所以需要在类中添加一个只有一个参数的构造方法
         list.stream()
                .map(stu::new)
                .forEach(e -> System.out.println(e+"我使用的构造方法"));

    }
}

class stu{
    private String name;
    private Integer age;

    public stu() {
    }

    public stu(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public stu(String s) {
        this.name = s.split("-")[0];
        this.age = Integer.parseInt(s.split("-")[1]);

    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "stu{name = " + name + ", age = " + age + "}";
    }
}