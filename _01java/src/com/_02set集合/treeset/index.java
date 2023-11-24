package com._02set集合.treeset;

import java.util.TreeSet;

// 特点：元素唯一，无索引，可排序
// 集合不能添加基本数据类型


// 默认排序方式
// 对于数值类型：从小到大

// 对于字符，字符串，按照asc码排序
// 字母排序说白就是了
// 注意点：在aa 和 aaa中 ，aa排在前面
public class index {
    public static void main(String[] args) {
        // 创建treeset对象
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(12);
        ts.add(13);
        ts.add(14);
        ts.add(15);
        System.out.println(ts);
        // 遍历：for增强 foreach 迭代器都可以


        // 自定义对象的排列顺序 这里的自定义对象就是new 出来的实例对象
        // treeset没有针对自定义对象的规则


        // 下面的方式一和方式二都存在，以方式二为准
        // 方式一:自然排序
        // 通过类去实现一个叫做compareble的接口

        person per1 = new person("zhangsna", 20);
        person per2 = new person("lisi", 21);
        person per3 = new person("wangwu", 23);
        person per4 = new person("gouliu", 25);

        TreeSet<person> list = new TreeSet<>();
        list.add(per1);
        list.add(per2);
        list.add(per4);
        list.add(per3);
        //报错
        System.out.println(list);

        //方式二：比较器排序
        // comparator
        // 例子：对四个字符穿，按长度排序，长度一直按字母顺序排序
        TreeSet<String> Ts = new TreeSet<>((String o1, String o2) -> {
            // 判断长度
            int length = o1.length() - o2.length();
            length = length == 0 ? o1.compareTo(o2) : length;
            return length;
        });
        //new TreeSet<>(new Comparator<Object>() {
        //});
        Ts.add("c");
        Ts.add("ab");
        Ts.add("df");
        Ts.add("cYYY");
        System.out.println(Ts);
    }
}

class person implements Comparable<person> {

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
    public int compareTo(person o) {
        System.out.println("我是this：" + this + "我是o:" + o);
        //通过年龄的大小进行排序
        int result = this.getAge() - o.getAge();
        return result;
    }
}
