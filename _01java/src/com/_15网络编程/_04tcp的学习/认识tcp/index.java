package com._15网络编程._04tcp的学习.认识tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class index {
    public static void main(String[] args) throws IOException {
        // tcp 发送数据
        // 创建socket对象
        // 细节 在创建对象的同时会连接服务器
        // 如果连接不上 代码会报错
        Socket socket = new Socket("127.0.0.1", 3000);

        // 可以连接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        // 写出数据
        os.write("aaa啊啊啊".getBytes());
        os.close();
        socket.close();
    }
}
