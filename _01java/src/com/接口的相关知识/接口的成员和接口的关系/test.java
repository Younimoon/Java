package com.接口的相关知识.接口的成员和接口的关系;

public class test implements inter{
    // 不写构造方法，会自动在虚拟机里面写一个无参构造
    @Override
    public void methods() {
        System.out.println("我是接口实现的方法");
    }
}
