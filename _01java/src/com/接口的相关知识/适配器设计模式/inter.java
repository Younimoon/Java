package com.接口的相关知识.适配器设计模式;

// 如果在其他的实现类中，只想用method1，可以通过一个设配器去空实现所有的抽象类，然后在需要使用的地方进行继承并重写对应的类
public interface inter {
    void method1();
    void method2();
    void method3();
    void method5();
    void method6();
    void method7();
}
