package com._13多线程的学习.阻塞队列实现等待唤醒机制;

import java.util.concurrent.ArrayBlockingQueue;

public class index {
    public static void main(String[] args) {
        // 阻塞队列：注意生产者消费者必须使用同一个队列
        // 当队列满的时候，数据无法存入 称为阻塞
        // 当队列没有数据的时候，数据无法获取，也叫阻塞

        // take获取，put存储：两个方法都包含了锁，所以不需要我们认为再去添加锁对象

        // 阻塞队列的继承结构
        // 继承了 Iterator Collection Queue BlockingQueue 接口


        // 实现类：
        // 创建阻塞队列对象
        //ArrayBlockingQueue 底层是数组，有界的
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);// 参数为存放的大小


        cook co = new cook(queue);
        food fo = new food(queue);
        co.start();
        fo.start();

        //LinkedBlockingDeque 无界
    }
}

class cook extends Thread {
    ArrayBlockingQueue<String> queue;

    public cook() {
    }

    public cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            //加入数据到队列
            try {
                queue.put("面条");
                System.out.println("我加了面条哦");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}

class food extends Thread {
    ArrayBlockingQueue<String> queue;

    public food() {
    }

    public food(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            //获取数据
            String food = null;
            try {
                food = queue.take();
                System.out.println("我吃" + food);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}