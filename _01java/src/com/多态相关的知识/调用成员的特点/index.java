package com.多态相关的知识.调用成员的特点;

//animal 这些都属于对象类型
//（a instanceof Dog d）
// 上面表示a是否属于对象类型Dog 是的话就强转成dog类并且变量名d
// 在方法中，如果父类的类型作为参数传递的话，参数可以接收所有的子类对象
// 多态的弊端：因为多态的定义对象的数据类型是父类的对象类型，所以不能使用子类特有的方法，会报错

public class index {
    public static void main(String[] args) {
        // 编译看左边是指：如果左边的类中不存在需要变量或方法会报错
        // 编译通过之后需要运行的变量还是左边类的变量但是方法却是执行右边的方法
        // 如果是多态的话需要在子类中重写父类方法，调用方法会优先执行子类方法，当子类无对应方法会执行父类对应的方法
        Animal a = new Dog();
        //多态成员变量：编译运行看左边
        System.out.println(a.name);
        //多态成员方法：编译看左边，运行看右边
        a.show();

        //instanceof关键字
        //作用：用来判断某个对象是否属于某种数据类型。
        System.out.println(a instanceof Dog);
        // a现在是animal类型，如果想把a转换成Dog类型可以通过强转实现
        Dog b = (Dog) a;
        System.out.println(b.name);

        System.out.println(b instanceof Animal);

    }
}

class Animal{
    String name = "动物";
    void show(){
        System.out.println("我是动物方法");
    }
}
// 子类的成员变量其实存在两个name，一个父类继承下来的一个子类的，使用哪个变量需要看定义的对象类型
class Dog extends Animal{
    String name = "狗子";
    @Override
    void show(){
        System.out.println("我是一条狗");
    }
}

