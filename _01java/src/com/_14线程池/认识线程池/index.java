package com._14线程池.认识线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class index {
    public static void main(String[] args) {

        // 以前写线程的弊端
        // 用到线程才会创建，用完后就会消失

        //核心原理：
        // 1 创建一个空池子，
        // 2 提交任务时，池子会创建新的线程对象，任务执行完毕，线程归还给池子
        // 下次再提交任务时，不需要创建新的线程，直接复用已有的就行了
        // 3 但是如果提交时，池子中没有空闲的线程，也无法创建新的线程，任务就会排队等待


        // 代码
        // 创建线程池
        //获取线程池对象
        // 参数为创建最多的线程池个数
        ExecutorService pool1 = Executors.newFixedThreadPool(2);

        // 提交任务
        pool1.submit(new MyRunnalbel());
        pool1.submit(new MyRunnalbel());
        pool1.submit(new MyRunnalbel());


        // 所有任务完成后，关闭线程池（一般不会手动销毁）
        //pool1.shutdown();

    }
}

class MyRunnalbel implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "------" + i);
        }
    }
}
