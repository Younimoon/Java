package com.常见api.runtime;

import java.io.IOException;

//Runtime类是一个单例类，
// 可以通过调用其静态方法Runtime.getRuntime()来获取唯一的Runtime对象。
// 最常用的功能是执行外部命令、获取JVM的相关信息以及管理JVM的资源。
public class index {
    public static void main(String[] args) {

        //exec()：用于执行外部命令或程序。例如，可以使用exec()方法在Java程序中执行shell命令：
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec("ls -l");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //totalMemory()：获取JVM的总内存量（以字节为单位）：
        Runtime runtime1 = Runtime.getRuntime();
        long totalMemory = runtime1.totalMemory();

        System.out.println("Total Memory: " + totalMemory + " bytes");
        //freeMemory()：获取JVM的空闲内存量（以字节为单位）：
        Runtime runtime2 = Runtime.getRuntime();
        long freeMemory = runtime2.freeMemory();
        System.out.println("Free Memory: " + freeMemory + " bytes");

        //maxMemory()：获取JVM的最大可用内存量（以字节为单位）：
        Runtime runtime3 = Runtime.getRuntime();
        long maxMemory = runtime3.maxMemory();
        System.out.println("Max Memory: " + maxMemory + " bytes");

        //gc()：运行垃圾回收器。可以通过调用gc()方法来显式触发垃圾回收：
        Runtime runtime4 = Runtime.getRuntime();
        runtime4.gc();
    }
}
