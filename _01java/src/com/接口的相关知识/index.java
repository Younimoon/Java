package com.接口的相关知识;

public class index {
    public static void main(String[] args) {
        a asd =  new a() {
            public  void eat(){

            }
        };
       a av =  new b(){
            public void eat(){

            }
        };
    }
}

interface a {
    void eat();
}

abstract class  b implements a {
    public abstract void eat();
}