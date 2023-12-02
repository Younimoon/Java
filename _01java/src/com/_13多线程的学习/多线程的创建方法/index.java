package com._13多线程的学习.多线程的创建方法;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// 三种多线程方法的选择
// 想要获取多线程的结果选择第三种

// 第一种：编写简单，扩展性较差，不能再继承其他类
// 第二种，第三种：扩展性强，可以实现其他接口的同时还能继承其他类，缺点：不能直接操作Thread类
public class index {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 方法一
        // 继承于Thread类
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        t1.setName("黄");
        t2.setName("威鹏");
        //通过此对象调用start():①启动当前线程 ② 调用当前线程的run()
        t1.start();
        t2.start();

        // 方法二
        // 实现Runnable接口
        MThread mtThread = new MThread();
        Thread t3 = new Thread(mtThread);
        Thread t4 = new Thread(mtThread);
        t3.setName("黄1");
        t4.setName("威鹏1");
        t3.start();
        t4.start();

        // 方法三：利用callable接口和future接口方式实现
        // 特点：可以获取多线程的运行结果

        // 实现callable接口重写call方法，call具有返回值，返回值为多线程结果

        //创建对象
        Mycallable mc = new Mycallable();
        //创建futureTask对象（作用：管理多线程运行结果）
        FutureTask<Integer> ft = new FutureTask<>(mc);
        // 创建线程对象

        Thread t5 = new Thread(ft);
        t5.start();
        // 获取多线程的结果
        Integer result = ft.get();
        System.out.println(result);
    }
}
// 方法一
class myThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HELLO" + i + this.getName());
        }
    }
}

//方法二
class  MThread implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("HELLO" + i );
        }
    }

}

// 方法三
// 这里的泛型代表返回值
class Mycallable implements Callable<Integer>{
    @Override
    public Integer call(){
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;

    }

}
