package com.接口的相关知识.接口和类之间的关系;

//类和类之间的关系：只能单继承，不能多个同时继承，但是可以多层继承

// 类和接口之间：实现关系：可以单实现，也可以多实现，还可以继承一个类的同时还可以进行多个接口的实现
// 注意如果在实现类中实现了多个抽象方法，那么则需要将多个抽象方法全部重写
// 一个抽象类也是如此

//多个方法中存在重名的方法只需要写一次
public class index implements inter,inter2{

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
    public void method4() {

    }
}
