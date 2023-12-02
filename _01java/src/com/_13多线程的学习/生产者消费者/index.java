package com._13多线程的学习.生产者消费者;

public class index {
    public static void main(String[] args) {
        // 消费者：消费数据
        // 生产者：生产数据

        // 线程主要方法：
        // wait ：当前线程等待，知道被其他线程唤醒
        // notify ： 随机唤醒单个等待线程
        // nofifyAll：唤醒所有等待线程

        cook ck = new cook();
        ck.setName("厨师");

        eater ea = new eater();
        ea.setName("吃货");

        ck.start();
        ea.start();

    }
}

// 生产者类
//厨师例子
class cook extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (desk.lock) {
                if (desk.count == 0) {
                    break;
                } else {
                    if (desk.foodFlag == 0) {
                        // 做面条
                        System.out.println("我要来做面条了啊");
                        desk.foodFlag = 1;
                        desk.lock.notifyAll();

                    } else {
                        try {
                            desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}

// 消费者
// 吃客例子
// 要吃10碗面条
class eater extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (desk.lock) {
                // 吃了10碗面就退出
                if (desk.count == 0) {
                    break;
                } else {
                    if (desk.foodFlag == 1) {
                        System.out.println("开吃,我在吃" + desk.count + "碗");
                        desk.count--;
                        desk.foodFlag = 0;

                        // 叫醒厨师等待
                        desk.lock.notifyAll();
                    } else {
                        try {
                            desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}

//中间：控制生产者和消费者的执行
// 桌子
class desk extends Thread {
    // 是否桌上有面条 有：1 无：0
    public static int foodFlag = 0;
    // 总个数
    public static int count = 10;
    //锁对象
    public static Object lock = new Object();
}