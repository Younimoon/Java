package com._13多线程的学习.同步方法;

public class index {
    public static void main(String[] args) {
        //同步方法 格式
        //修饰符  synchronized 返回值类型 name(args){}
        // 特点:锁住方法内部的所有代码
        // 锁对象不能自己指定 非静态（this） 静态（当前类的字节码文件对象）

        //卖票 用同步方法
        MyRunnable mr = new MyRunnable();
        Thread tr1 = new Thread(mr, "黄1");
        Thread tr2 = new Thread(mr, "黄2");
        Thread tr3 = new Thread(mr, "黄3");
        tr1.start();
        tr2.start();
        tr3.start();

    }
}

class MyRunnable implements Runnable {
    // 因为该类只会被创建一次，三个窗口共享一个对象
    // 所以我们不需要加static关键字
    int tetick = 0;

    //将同步代码块的代码封装成一个方法

    private  synchronized  boolean  sync(){
        if (tetick <= 99) {
            tetick++;
            System.out.println(Thread.currentThread().getName() + "卖了" + tetick + "张票");
            return true;
        } else {
            return false;
        }
    }

    // 调用这个方法的对象就是代表的 synchronized ()方法的内部参数
    @Override
    public void run() {
        while (true) {
           if(!this.sync()){
               break;
           }
        }
    }
}
