package com.常见api.object和objects;

public class index {
    public static void main(String[] args) {
        Object object = new Object();
        String str = object.toString();
        // 直接打印对象返回地址值
        System.out.println(str); //java.lang.Object@4eec7777
        // 想要打印对象内部的属性，可以重写tostring方法

        person Per = new person("huang");
        System.out.println(Per);
        System.out.println(Per.toString());
        // 两次打印结果一样的原因是,object类型的在打印的api里面会自动调用tostring方法
    }
}

class person{
    private String name;

    public person() {
    }

    public person(String name) {
        this.name = name;
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

    public String toString() {
        return "person{name = " + name + "}";
    }
}

// Java的浅拷贝深拷贝

