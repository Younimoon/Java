package com._13多线程的学习.线程的安全问题;

public class index {
    public static void main(String[] args) {
        // 需求：100张票，三个窗口同时销售，模拟一个卖票场景
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

    @Override
    public void run() {
        while (true) {
            //将内部锁起来，只能当前线程里面的这段代码执行结束后下一个线程才会执行内部代码
            synchronized (obj){
                // 一般我们写里面的参数是写该类的字节码文件：Mythread.class
                if (tetick <= 99) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    tetick++;
                    // 打印100，101，102票的原因，三张99的票都竞争进入了，随机一个自增了其他的竞争到了也自增，但是都没有打印
                    // 等到都自增结束就进行打印
                    System.out.println(Thread.currentThread().getName() + "在卖" + tetick + "张票");
                } else {
                    break;

                }
            }

        }
    }
}

