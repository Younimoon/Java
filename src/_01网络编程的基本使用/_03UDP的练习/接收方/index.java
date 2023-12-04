package _01网络编程的基本使用._03UDP的练习.接收方;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class index {
    public static void main(String[] args) throws IOException {
        // 不知道什么时候能接收到，所以通过死循环来判断
        DatagramSocket dr = new DatagramSocket(8011);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        System.out.println(111111111);
        dr.receive(dp);
        System.out.println(222222);
        while (true) {
            byte[] data = dp.getData();
            int len = dp.getLength();
            InetAddress name = dp.getAddress();
            int port = dp.getPort();
            if (data != null && len != 0 && name != null) {
                System.out.println("接受的数据11232131");
                System.out.println(new String(data, 0, len));
                // port为5xxxx是因为发送端是随机的一个端口
                System.out.println(name + "-----" + port);
                break;
            }
        }
    }
}
