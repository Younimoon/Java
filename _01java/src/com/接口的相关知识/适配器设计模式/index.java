package com.接口的相关知识.适配器设计模式;

public class index {
    public static void main(String[] args) {
        Index1 index = new Index1();
        index.method1();
    }
}
class Index1 extends Index{
    public void method1(){
        System.out.println("我重写了");
    }
}
class Index implements inter{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method5() {

    }

    @Override
    public void method6() {

    }

    @Override
    public void method7() {

    }
}
