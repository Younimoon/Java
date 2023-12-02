package com._13多线程的学习.守护线程;

public class index {
    public static void main(String[] args) {
        MyThread1 tr1 = new MyThread1();
        MyThread2 tr2 = new MyThread2();
        tr1.setName("黄");

        tr2.setName("威鹏");
        // 设置守护线程的方法
        // 守护线程：当其他非守护线程执行完毕后，守护线程会慢慢结束，不会等着自己执行完后才结束，
        tr2.setDaemon(true);
        //final void setDaemon ,final:不可以重写

        tr1.start();
        tr2.start();

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName()+i);
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName()+i);
        }
    }

}