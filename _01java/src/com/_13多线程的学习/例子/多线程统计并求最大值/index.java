package com._13多线程的学习.例子.多线程统计并求最大值;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class index {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 一个抽奖池子，存放一些奖金
        // {10,5,21,32,54,1,100,200,300,800}
        // 两个抽奖箱随机进行抽奖
        // 当抽完奖了对

        MyCallable mt = new MyCallable();
        FutureTask<Integer> ft1 = new FutureTask<>(mt);
        FutureTask<Integer> ft2 = new FutureTask<>(mt);
        Thread th1 = new Thread(ft1);
        th1.setName("窗口一");
        Thread th2 = new Thread(ft2);
        th2.setName("窗口二");
        th1.start();
        th2.start();
        Integer result1 = ft1.get();
        Integer result2 = ft2.get();
        System.out.println(result1);
        System.out.println(result2);
    }
}

// 获取抽奖箱抽到的最大值并且返回
class MyCallable implements Callable<Integer> {
    private ArrayList<Integer> moneyPool = new ArrayList<>(Arrays.asList(10, 5, 21, 32, 54, 1, 100, 200, 300, 800));
    Lock lock = new ReentrantLock();

    @Override
    public Integer call() {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            lock.lock();
            try {
                if (moneyPool.size() == 0) {
                    System.out.println(boxList);
                    System.out.println("没有奖金了,别来了" + Thread.currentThread().getName());
                    break;
                } else {
                    int random = new Random().nextInt(moneyPool.size());
                    System.out.println("恭喜" + Thread.currentThread().getName() + "抽到现金" + moneyPool.get(random));
                    boxList.add(moneyPool.get(random));
                    moneyPool.remove(random);

                }
            } finally {
                lock.unlock();
            }
        }
        if(boxList.size()==0){
            System.out.println("你比较霉");
            return null;
        }
        boxList.sort((a,b)->b-a);

        return boxList.get(0);
    }
}