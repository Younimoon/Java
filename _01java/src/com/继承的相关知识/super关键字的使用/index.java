package com.继承的相关知识.super关键字的使用;
// 对于子类重写父类的注意事项
// 子类重写方法不能比父类该方法的修饰符权限更低
// 比如父类方法是public 子类就只能是public

//声明为 final 的方法不能被重写。
public class index {
    public static void main(String[] args) {
        Dog son = new Dog();
        son.call();
    }
}
class Animal{
    public Animal(){
        System.out.println("我是父类的构造方法");
    }
    public Animal(int num){
        System.out.println("我是具有参数的super"+num);
    }
    void call(){
        System.out.println("我是父类");
    }
}

class Dog extends Animal{
    public Dog(){
        // 子类的构造函数中使用调用父类的构造函数使用super（）
        // 如果不写的话，也是会起到同样的效果
        // 但是如果父类有多个构造函数,我们可以给super进行传参然后java会自动调用对应参数的勾走凹函数
        // 该方法必须是在子类构造函数的第一行
        super(123);
    }
     private void call1(){
         System.out.println("我是儿子");
     }
     public void call(){
         super.call();
         this.call1();
     }

}