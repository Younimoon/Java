package com.接口的相关知识.接口的新增方法和运用和适配器;

public class Test {
    public static void main(String[] args) {
        test Test = new test();
        Test.method();
        Test.method1();
    }
}
class test implements inter1,inter2,inter3,inter4{
    // 重写接口默认方法
    // 注意：需要省略default
    // 如果实现了多个接口，在多个接口当中存在相同方法名的默认方法，那么必须重写
    @Override
    public void method(){
        System.out.println("我重写默认方法");
        // 调用inter3的method方法
        inter3.method();
    }
    @Override
    public void method1(){
        System.out.println(123);
    }

}

