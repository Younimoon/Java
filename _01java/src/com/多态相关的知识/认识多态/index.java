package com.多态相关的知识.认识多态;

// 多态：描述一个事物的多种形态
// 表现形式：父类类型 对象名称 = new 子类对象（）

// 多态的前提：有继承关系  有父类引用指向子类对象  方法重写
// 形如 fu f = new zi()
public class index {
    public static void main(String[] args) {
        Person stu = new stu("黄",20);
        Person tea = new teacher("weipeng",10);
        register(stu);
        register(tea);
    }
    public static void register(Person p){
        p.show();
    }

}
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    public void show() {
        System.out.println("Person{name = " + name + ", age = " + age + "}");
        //return "Person{name = " + name + ", age = " + age + "}";
    }
}

class stu extends Person{
    public stu(String name, int i) {
        super(name,i);
    }

    @Override
    public void show(){
        System.out.println("学生的信息"+getName()+","+getAge());
    }
}
class teacher extends Person{
    public teacher(String name, int i){
        super(name,i);
    }

    @Override
    public void show(){
        System.out.println("老师的信息"+getName()+","+getAge());
    }
    void  teach(){
        System.out.println("我在教书");

    }
}
