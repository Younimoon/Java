package com.抽象类和接口的结合例子;

public abstract class spotter extends Person{
    public spotter() {
    };
    public spotter(String name, int age) {
        super(name,age);
    }
    public abstract void study();

}
