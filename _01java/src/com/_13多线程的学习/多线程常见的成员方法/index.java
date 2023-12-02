package com._13多线程的学习.多线程常见的成员方法;

public class index {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();


        // string getName() 返回线程的名称
        // 不设置名字，默认为Thread-x(x为序号，从0开始)
        String name = t1.getName();

        // void setName() 设置线程名字，构造方法也可以设置
        t1.setName("黄伟鹏拍那个");
        MyThread t2 = new MyThread("黄哥");

        // static Thread curentThread()获取当前的线程对象
        Thread t = Thread.currentThread();
        // 细节：gvm虚拟机启动之后，会自动启动多条线程，其中存在一条线程叫做main线程，会调用里面的mian方法，并执行里面的代码
        System.out.println(t.getName()); // main

        //  static void sleep 让线程进行休眠，单位为毫秒
        System.out.println(111);
        Thread.sleep(1000);
        System.out.println(222);

        //t1.start();
        //t2.start();


    }
}

class MyThread extends Thread {
    // 继承父类的构造方法，给子类添加设置名称的方法
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName());
        }
    }
}