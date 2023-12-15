package com._15网络编程._04tcp的学习.认识tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class recieve {
    public static void main(String[] args) throws IOException {
        // tcp协议接收数据
        // 创建一个ServerSocket对象
        ServerSocket ss = new ServerSocket(3000);

        //监听客户端的连接(一直等客户端的资源)
        Socket socket =  ss.accept();

        //从连接通道中获取输入流读取数据
        InputStream is = socket.getInputStream();
        int b;

        // 中文乱码的原因：因为utf-8的中文为三个字节组成
        // 然后is代表的是一个字节，所以转化为char会转化为三分之一个中文就乱码了
        // 使用字符流可以避免

        InputStreamReader isr = new InputStreamReader(is);
        while ((b = isr.read()) != -1) {
            System.out.println((char) b);

        }

        // 释放资源
        // 断开和客户端连接
        socket.close();
        // 关闭服务器
        ss.close();

    }
}
