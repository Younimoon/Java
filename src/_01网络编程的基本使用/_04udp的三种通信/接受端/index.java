package _01网络编程的基本使用._04udp的三种通信.接受端;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Arrays;

public class index {
    public static void main(String[] args) throws IOException {
//        組播接受
        MulticastSocket ms = new MulticastSocket(10086);

        InetAddress address = InetAddress.getByName("224.0.0.2");
        ms.joinGroup(address);

        // 创建一个数据包对象
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        // 接受数据
        System.out.println(11111);
        ms.receive(dp);
        System.out.println(222222);

        byte[] data = dp.getData();
        InetAddress name = dp.getAddress();
        int port = dp.getPort();
        System.out.println("我的数据是" + Arrays.toString(data) + "地址" + name + "端口号" + port);
    }
}