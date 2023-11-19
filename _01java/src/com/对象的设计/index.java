package com.对象的设计;

public class index {
    // 对象代表什么，就的封装对应的数据，并提供对应数据对应的行为
    // 比如人开关门的对象封装
    // 门这个类就有开和关的行为而人这个类就只有调用开和关行为

    // 私有属性 pravite关键字
    // 只能被本类访问不能被new之后的类进行访问属性

    // 但是我们外界如果需要访问到私有属性获取修改私有属性
    // 可以通过调用类的共有方法并在方法中返回私有属性或者私有私有属性
    // 如下
    private int age;
    public String name;

    public void setAge(int num) {
        //age = num;
        // 使用this关键字来赋值
        this.age = num;
        //return age;
    }

    // 就近原则：当多个变量同名，一个变量离输出语句越近就输出那个变量
    public int getAge() {
        int age = 30;

        System.out.println(this.age);
        //在 Java 类中，
        //公有方法的 this 关键字指向调用该方法的对象实例，
        //而不是类本身或使用 new 关键字创建的新对象。
        //当你调用一个公有方法时，this 将引用调用该方法的对象实例。
        //无论是通过类的构造函数创建的新对象还是对已有对象的方法调用，
        //this 都代表当前对象的引用。
        System.out.println(this);
        // 返回30
        return age;
    }

    // 构造方法，有点像js的constructor，也是支持重载的哦
    // 格式 ：修饰符 类名（参数）{}
    // 特点：方法名必须和类名一模一样（大小写也是）
    // 没有返回值类型，没有void 不能携带return
    // 也可以写一个空参数，就是默认值
    // 但是如果没有这些构造方法，会自动创建一个空参构造
    // 该方法自动调用，每创建一个实例调用一次
    public index(int age, String name) {
        this.age = age;
        this.name = name;
    }

}
