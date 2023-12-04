package _01网络编程的基本使用._02udp的接受;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class index {

    public static void main(String[] args) throws IOException {
        // 接受数据
        // 创建接受对象

        DatagramSocket ds = new DatagramSocket(10086);
        // 接受打包好的数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        System.out.println(1111);
        // resever方法是阻塞的
        ds.receive(dp);
        System.out.println(222);
        // 解析数据包
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress name = dp.getAddress();
        int port = dp.getPort();
        System.out.println("接受的数据");
        System.out.println(new String(data, 0, len));
        // port为5xxxx是因为发送端是随机的一个端口
        System.out.println(name + "-----" + port);
        // 释放资源
        ds.close();
    }
}
