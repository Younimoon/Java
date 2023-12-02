package com._13多线程的学习.例子.卖电影票;

public class index {
    public static void main(String[] args) {
        // 1000张票 两个窗口 每张票间隔 3m
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        th1.setName("窗口1");
        th2.setName("窗口2");
        th1.start();
        th2.start();
    }
}

class MyThread extends Thread {
    private static int tetick = 100;
    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (tetick > 0) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName() + "这是卖的" + tetick + "张票" );
                    tetick--;
                }else{
                    System.out.println("没票了不没办法卖了");
                    break;
                }
            }
        }
    }
}