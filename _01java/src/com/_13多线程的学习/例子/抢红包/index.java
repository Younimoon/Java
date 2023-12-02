package com._13多线程的学习.例子.抢红包;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class index {
    public static void main(String[] args) {
        // 100块分成3个红包5个人抢
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();
        MyThread mt4 = new MyThread();
        MyThread mt5 = new MyThread();
        mt1.setName("黄1");
        mt2.setName("黄2");
        mt3.setName("黄3");
        mt4.setName("黄4");
        mt5.setName("黄5");
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();

    }
}

class MyThread extends Thread {
    static double money = 100;
    static int count = 3;
    static final double MIN = 0.01;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println(count);
            if (count == 0) {
                System.out.println("红包哦已经没有了不要再来了");
            } else {
                if (count == 1) {
                    System.out.println("恭喜" + Thread.currentThread().getName() + "抽到了" + money + "元");
                } else {
                    Random r = new Random();
                    double prize = r.nextDouble(money - (count - 1) * MIN);
                    if (prize < 0.01) {
                        prize = 0.01;
                    }
                    System.out.println("恭喜" + Thread.currentThread().getName() + "抽到了" + prize + "元");
                    money -= prize;
                }
                count--;
            }
        } finally {
            lock.unlock();
        }

    }
}