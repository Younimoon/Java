package com.继承的相关知识.继承的初始;

// 子类继承父类
// 子类又叫做派生类
// 父类又叫做基类

// 子类可以继承父类的共有属性和公有方法和静态属性和静态方法
// 子类继承父类的方法后，可以直接进行调用或者重写父类的方法
// 子类可以继承父类的构造方法，通过super关键字调用父类的构造方法来完成对父类属性的初始化。

// 注意：如果子类中定义了与父类相同的字段或方法，则子类会覆盖（隐藏）父类的相应字段或方法，
// 除非使用super关键字来访问父类的成员。
public class index {
    public static void main(String[] args) {
        // 父类 shape
        // 子类circle rectangle
        Circle circle = new Circle();
        circle.draw();                      // 调用子类的draw方法
        circle.calculateArea(5.0);          // 调用子类的calculateArea方法
        System.out.println(circle.name);
        Rectangle rectangle = new Rectangle();
        rectangle.draw();                   // 调用子类的draw方法
        rectangle.calculateArea(4.0, 6.0);
    }
}

// 父类
class Shape {
    String name ;
    //public String Name;
    public void draw() {
        System.out.println("Drawing a shape...");
    }
}

// 子类继承自父类
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }

    public void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
        System.out.println(this.name);
    }
}

// 子类继承自父类
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }

    public void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}