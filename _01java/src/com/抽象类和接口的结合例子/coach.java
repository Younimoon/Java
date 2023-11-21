package com.抽象类和接口的结合例子;

public abstract class coach extends Person{
    public coach() {
    };
    public abstract void teach();

    public coach(String name,int age) {
        super(name,age);
    }}
