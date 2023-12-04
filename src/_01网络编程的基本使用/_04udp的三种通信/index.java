package _01网络编程的基本使用._04udp的三种通信;

import java.io.IOException;
import java.net.*;

public class index {
    public static void main(String[] args) throws IOException {
        // 单播 组播 广播
//        单播：以前的代码形式
//        组播：组播地址224.0.0.0-239.255.255.255 其中224.0.0.0-224.0.0.255 为预留的组播地址

        MulticastSocket ms = new MulticastSocket();

        String str = "你好啊，朋友";
        byte[] bytes = str.getBytes();
        int port = 10086;
        InetAddress address = InetAddress.getByName("224.0.0.2");
        DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, address, port);
        ms.send(dp);
        ms.close();
//        广播
    }
}
