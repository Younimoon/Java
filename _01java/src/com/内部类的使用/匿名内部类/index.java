package com.内部类的使用.匿名内部类;

// 匿名内部类的格式如下
// new 类名或接口名（）{
//  重写方法
// }

// 当new的是一个
// 匿名内部类省去了
public class index {
    public static void main(String[] args) {

        // 内部类
        // new：代表创建了一个对象，对象是后表面的 {
        //            public void eat() {
        //                System.out.println("我是内部类实现的方法");
        //            }
        //        }
        // Animal：实现或继承（取决于animal是接口还是类）：匿名对象实现或继承了Animal，并重写animal的抽象方法
        // （）：表示创建匿名类的时候使用的是空参构造
        Animal a =  new Animal() {
            public void eat() {
                System.out.println("我是内部类实现的方法");
            }
        };

        // person为后面{}的父类，{}为子类，重写了父类的抽象方法
        // new是创建了{}的对象
        // （）：空参构造
        // 这个整体是一个new出来的对象不上匿名内部类
        new person(){
            @Override
            void eat() {
                System.out.println("我是内部类实现的方法");
            }
        };
        // 在测试类中调用method方法
        //以前的方式
        // 创建一个animal类或者animal的子类
        // 直接调用method方法参数为创建的类或者子类
        person per = new per();
        method(per);

        // 现在直接写一个内部类就不用单独写一个子类去重写抽象方法
        person person = new person() {
            @Override
            void eat() {
                System.out.println("我直接重写");
            }
        };
        method(person);
    }
    static void method(person a){
        a.eat();
    }

}

interface Animal {
    void eat();
}

abstract class person{
    abstract void eat();
}
class per extends person{
    @Override
    void eat(){
        System.out.println("我是普通方法");
    }
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating.");
    }
}