package com.接口的相关知识.接口和类之间的关系.接口之间的关系;


// 接口之间：可以单继承也可以多继承
// 如果接口c继承了接口b，接口b继承了接口a
// 那么如何实现类实现了接口c那么要重写接口a+b+c的抽象方法
public interface interface1 {
    public abstract void method1();
    public abstract void method2();
    public abstract void method3();
}
interface interface3 {
    public abstract void method1();
    public abstract void method2();
    public abstract void method3();
}
interface interface2 extends interface1,interface3{
    // 感觉这么写没什么意义
    //public abstract void method1();
    public abstract void method4();
}
class index implements interface2{
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
