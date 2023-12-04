package _01网络编程的基本使用._01udp的学习;

import java.io.IOException;
import java.net.*;

public class index {
    public static void main(String[] args) throws IOException {
        // 发送数据
        // 创建一个datagramsocket对象
        // 綁定端口：通过这个端口往外发送数据
        // 空参：所有可用的端口中随机一个进行使用
        // 有参： 指定端口进行绑定
        DatagramSocket ds = new DatagramSocket();
        String str = "您好 啊啊";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        // 打包数据
        DatagramPacket dr = new DatagramPacket(bytes, bytes.length, address, port);
        // 发送数据
        ds. send(dr);
        ds.close();
    }
}
