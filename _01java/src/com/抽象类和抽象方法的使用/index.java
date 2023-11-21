package com.抽象类和抽象方法的使用;

// 抽象类的注意事项
// 1.抽象类不能被实例化
// 2.子类继承抽象类，如果子类不上抽象类，则可以实例化
// 3.具有抽象方法的类一定是抽象类，但是反过来不一定
// 4.构造方法和用static修饰的方法不能作为抽象类
// 5.抽象类的子类必须给出抽象方法的具体实现
// 如果子类是抽象类可以不实现父类的抽象方法
public class index {
    public static void main(String[] args) {
        cat dog1 = new cat() ;
        dog1.Call();

        //System.out.println();

    }
}

abstract class Animal{
    public abstract void Call();
}

abstract class dog extends Animal{
     public abstract void Call();
}
class cat extends Animal{
    public void Call(){
        System.out.println("我是子类");
    }
}
