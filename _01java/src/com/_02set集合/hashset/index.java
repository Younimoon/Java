package com._02set集合.hashset;

// hashcode是集合元素的标识符
//

//HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。

//HashSet 允许有 null 值。

//HashSet 是无序的，即不会记录插入的顺序。

//HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，
// 则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。

//HashSet中比较两个对象是否相同，要使用equals()方法，不能使用 ==；

//底层依然使用哈希表（散列）算法，其本质就是数组形式，
// 采用此算法就为提高查询的效率；

//插入速度也比较快，但适合于少量元素插入操作；
// 一旦所存储元素个数满足（size * loadFoctor > size），
// 哈希表就要扩容，此时操作速度极慢，性能就会降低！

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

//HashSet 实现了 Set 接口。
// 删 remove
// 清空 clear
// 是否存在某元素 contains

public class index {
    public static void main(String[] args) {
        HashSet<String> setlist = new HashSet<>();
        setlist.add("黄");
        setlist.add("威鹏");
        setlist.add("黄"); // 保证元素的唯一性，不会添加成功
        setlist.add(null);// 允许存储null
        System.out.println(setlist);
        String name = "huang ";
        String name1 = "huang ";
        String name2 = "huang ";

        // 一般来说hashlist的底层通过hashcode的不一样可以识别元素是否存在相同，
        //  但是对于对象来说，不管属性是否相同都会不一样，这违背了set的唯一性
        // 所以如果要添加对象类型的元素，需要重写hashcode方法，去保证这个bug的修复

        // 重写equls 的目的：但是在重写hashCode()方法时，
        // 几乎所有的写法都无法避免一个bug：
        // 有一些对象（当然是不同的对象）
        // ，会返回相同的哈希码（即重码），
        // 此时就需要借助equals()方法；
        person per1 = new person("颤1", 123);
        person per2 = new person("颤2", 123);
        person per3 = new person("颤3", 123);
        person per4 = new person("颤1", 123);

        HashSet<person> list = new HashSet<>();
        list.add(per1);
        list.add(per2);
        list.add(per3);
        list.add(per4);
        list.add(per4);
        System.out.println("我是对象哈市"+ list);
        // 遍历的方法
        // foreach
        setlist.forEach(e -> System.out.println(e));

        // for的增强
        for (String s : setlist) {
            System.out.println(s);
        }

        // 迭代器遍历
        Iterator<String> io = setlist.iterator();
        while (io.hasNext()) {
            Object str = io.next();
            System.out.println(str + "我是迭代器");
        }
    }
}

// hashcode方法存在于Object上，所以再类里面可以重写这个方法
class person {
    String name;
    int age;

    public person() {
    }

    public person(String name, int age) {
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
        return "person{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
