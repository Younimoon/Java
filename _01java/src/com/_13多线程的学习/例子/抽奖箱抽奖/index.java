package com._13多线程的学习.例子.抽奖箱抽奖;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class index {
    public static void main(String[] args) {
        // 一个抽奖池子，存放一些奖金
        // {10,5,21,32,54,1,100,200,300,800}
        // 两个抽奖箱随机进行抽奖
        // 当抽完奖了对

        MyRunnable mt = new MyRunnable();
        Thread th1 = new Thread(mt, "抽奖箱一");
        Thread th2 = new Thread(mt, "抽奖箱二");
        th1.start();
        th2.start();
    }
}

class MyRunnable implements Runnable {
    private  ArrayList<Integer> moneyPool = new ArrayList<>(Arrays.asList(10, 5, 21, 32, 54, 1, 100, 200, 300, 800));
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            System.out.println("我进来了"+ Thread.currentThread().getName());
            // 在这儿
            lock.lock();
            try {
                if (moneyPool.size() == 0) {
                    // 这句话可能被打印两次的原因是：
                    // 因为在while的时候可能多个线程交替进入了
                    // 每个线程都有自己的run方法，但是变量是共有的
                    // 因为在第一个break前有几个线程进入了循环当中，每个线程都要break才能进行退出
                    // 由于这里我们是两个线程，线程都进入了循环，所以要都退出循环才算结束
                    System.out.println("没有奖金了,别来了" + Thread.currentThread().getName());
                    break;
                } else {
                    int random = new Random().nextInt(moneyPool.size());
                    System.out.println("恭喜" + Thread.currentThread().getName() + "抽到现金" + moneyPool.get(random));
                    moneyPool.remove(random);
                }
            } finally {
                lock.unlock();
            }
        }
    }
}