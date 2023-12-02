package com._14线程池.自定义线程池;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class index {
    public static void main(String[] args) {
        // 临时线程的创建条件：
        // 核心线程都在执行且阻塞队列都已经满的情况才会创建临时线程去执行阻塞队列以外的任务（临时线程也是有个数限制的，自定义）

        // 线程池=核心线程+临时线程（可有可无临时线程）
        // 如果任务个数>核心线程个数+临时线程个数+阻塞队列长度 会将剩余的任务可进行任务拒绝策略

        // 创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,// 核心线程个数
                6,// 最大线程数量
                60,//空闲线程最大存活时间
                TimeUnit.SECONDS,//时间单位
                new ArrayBlockingQueue<>(3),//任务队列
                Executors.defaultThreadFactory(),//创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()
        );

    }
}
