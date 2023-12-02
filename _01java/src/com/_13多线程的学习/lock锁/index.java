package com._13多线程的学习.lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class index {
    public static void main(String[] args) {
        // Lock 是一个接口
        // 一个锁对象：lock
        //lock提供了锁的获取和释放的方法


        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        MyThread th3 = new MyThread();
        th1.setName("我是窗口1");
        th2.setName("我是窗口2");

        th3.setName("我是窗口3");
        // 会出现，卖同一张票和卖101张票的情况
        // 解决办法：同步代码块：将操作共享数据的代码锁起来
        // synchronized（a）{} 锁 a:锁对象（唯一的）
        // 特点：锁默认打卡，有一个线程进去了，锁会自动关闭
        // 里面的代码全部执行完毕，线程出来，锁自动打开

        th1.start();
        th2.start();
        th3.start();
    }
}

class MyThread extends Thread {
    static private int tetick = 0;
    static Object obj = new Object();
    //Lock是一个接口， ReentrantLock是Lock的实现类
    // 因为被创建了多个
    // 如果不加static 会创建多个lock对象，然后各自锁自己的代码块
    // 就三个线程三个锁，进行竞争，和之前一样的bug
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //synchronized (obj){
            // 上锁
            lock.lock();
            //if (tetick <= 99) {
            //    try {
            //        Thread.sleep(10);
            //    } catch (InterruptedException e) {
            //        throw new RuntimeException(e);
            //    }
            //    tetick++;
            //    System.out.println(Thread.currentThread().getName() + "在卖" + tetick + "张票");
            //} else {
            //    lock.unlock();
            //    break;
            //}
            //// 解锁
            //lock.unlock();

            // 或者使用
            // finnaly：不管前面try或者catch怎么执行，之后都会执行finally的代码
            try {
                if (tetick <= 99) {
                    Thread.sleep(10);
                    tetick++;
                    System.out.println(Thread.currentThread().getName() + "在卖" + tetick + "张票");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                System.out.println("我是最后执行的");
                lock.unlock();
            }
        }
    }
}
