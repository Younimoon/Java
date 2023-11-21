package com.继承的相关知识.super关键字的使用;

// 在构造函数中的具体使用
public class constructor {
    public static void main(String[] args) {
        index1 inde = new index1("huang", 20);
        System.out.println(inde.getName());
    }
}
class constructor1 {
    private String name;
    private int age;

    public constructor1() {
    }

    public constructor1(String name, int age) {
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

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "constructor{name = " + name + ", age = " + age + "}";
    }
}

class index1 extends constructor1{
    public index1(){
        super();
    }
    public index1(String name,int age){
        super(name, age);
    }
}

