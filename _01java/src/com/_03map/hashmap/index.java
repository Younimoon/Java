package com._03map.hashmap;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

// hashmap没有自身的特点，用map的api
// 特点：无序，不重复，无索引
// 和hashset一样的底层
// 每个位置存储着键的hash值与value无关
// 所以，如果键的位置存储着对象，那么就需要重写hashcode，和equls方法
public class index {
    public static void main(String[] args) {
        student stu1 = new student("黄1", 123);
        student stu2 = new student("黄2", 123);
        student stu3 = new student("黄3", 123);
        student stu4 = new student("黄4", 123);

        // 因为key是一个对象的格式，所以我们需要重写hashcode和equles方法
        HashMap<student, String> hm = new HashMap<>();
        hm.put(stu1, "重庆");
        hm.put(stu2, "万州");
        hm.put(stu3, "开县");
        hm.put(stu4, "开县");



        // keyset方法获取所有的键
        Set<student> keys = hm.keySet();
        System.out.println(keys);
        keys.forEach(e->{
            String value = hm.get(e);
            System.out.println(value);
        });
    }
}
class student {
    private String name;
    private int age;

    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
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
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return getAge() == student.getAge() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "student{name = " + name + ", age = " + age + "}";
    }
}