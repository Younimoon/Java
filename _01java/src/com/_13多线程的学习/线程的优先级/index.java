package com._13多线程的学习.线程的优先级;

public class index {
    public static void main(String[] args) {
        // 线程的调度
        // 1-10 优先级越大越先执行
        // 抢占式调度：随机执行某一线程（java的线程执行机制）
        // setPriority 设置线程的优先级，优先级越高，抢到线程的几率越大
        // final int getPriority 获取线程的优先级
        // 优先级越大抢到资源的概率越大不代表一定

        // 创建线程需要执行的参数对象
        Myrunnable mr = new Myrunnable();
        Thread tr1 = new Thread(mr, "黄");
        Thread tr2 = new Thread(mr);
        tr2.setName("威鹏");

        // 默认优先级 5
        System.out.println(tr1.getPriority());

        // main线程的默认优先级也是5
        System.out.println(Thread.currentThread().getPriority());

        // 设置优先级

        tr1.setPriority(1);
        tr2.setPriority(10);

        tr1.start();
        tr2.start();
    }
}

class Myrunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
