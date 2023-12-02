package com._13多线程的学习.礼让线程和插入线程;

public class index {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 tr1 = new MyThread1();

        MyThread1 tr2 = new MyThread1();
        tr1.setName("黄");

        tr2.setName("威鹏");

        // 插入线程
        // 将tr2的线程插入到当前线程之前
        // 让tr2执行结束后执行当前线程
        tr2.join();
        tr2.start();
        tr1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("我是主线程");
        }
    }
}
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+i);
            // 让出线程，重新竞争
            Thread.yield();
        }
    }
}