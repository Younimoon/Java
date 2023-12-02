package com._13多线程的学习.死锁;

public class index {
    public static void main(String[] args) {
        //死锁：是一个错误
        // 例如：A线程上了a锁
        // b线程上了b锁，然后两个线程都在等待对方线程释放锁，最终卡死
    }
}
