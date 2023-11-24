package com.多态相关的知识.认识多态.接口类型的多态;


// 接口的实现也可以把接口看成实现类的父类
// 进而实现多态的功能
public class index {
    public static void main(String[] args) {
        Person p = new per();
        call(p);
    }
    static void call(Person p ){
        p.call();
    }

}

interface Person {
    void call();
}
class  per implements Person{
    @Override
    public void call(){
        System.out.println("我重写方法");
    }
}
