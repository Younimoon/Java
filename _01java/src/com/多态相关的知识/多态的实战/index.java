package com.多态相关的知识.多态的实战;

public class index {
}

class animal {
    private String name;
    private int age;

    public animal() {
    }

    public animal(String name, int age) {
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

    public void eat(String something) {
        System.out.println("我要吃" + something);
    }

    public String toString() {
        return "animal{name = " + name + ", age = " + age + "}";
    }
}

class Dog extends animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}