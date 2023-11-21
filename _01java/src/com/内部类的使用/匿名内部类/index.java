package com.内部类的使用.匿名内部类;

public class index {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            public void eat() {
                System.out.println("Dog is eating.");
            }
        };
        dog.eat(); // 输出：Dog is eating.
    }
}
interface Animal {
    void eat();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating.");
    }
}