package com.接口的相关知识.接口的新增方法和运用和适配器;


// 接口中使用默认方法
// jdk8以后添加了default修饰
// 作用：因为接口中的如果只有抽象方法，实现类如果不用某个抽象方法也需要对其进行重写
// 为此就出现了默认方法，默认方法就是只有在需要的时候才会被重写
// 接口中默认方法的格式：
// 修饰符 default 返回类型 name(){}

public interface inter1 {
    public default void method() {
        System.out.println("我是默认方法");
    }
}

interface inter2 {
    public default void method() {
        System.out.println("我是默认方法");
    }
}

// 接口中使用静态方法
// 格式同上只是修改关键字
// 使用static关键字
// 只能通过接口名调用
// 也无法重写
interface  inter3 {
    static void method(){
        System.out.println("我是静态方法");
    }
}

// 接口中使用私有方法
// 只能在接口内部使用，相当于在接口内部封装一个接口内部可以访问的方法

interface inter4{
    // 静态私有方法
    private static void method(){
        System.out.println("我是封装的私有方法");
    }
    static void method2(){
      method()  ;
    };
    void method1();
}
