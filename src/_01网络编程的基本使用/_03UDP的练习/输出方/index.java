package _01网络编程的基本使用._03UDP的练习.输出方;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class index {
    public static void main(String[] args) throws IOException {
        // 创建对象
        DatagramSocket dr = new DatagramSocket();
        // 打包数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想输入的数据");
        String str = sc.nextLine();
        byte[] bytes = new byte[1024];

        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 8011;
        // 打包数据
        DatagramPacket dg = new DatagramPacket(bytes, 0, bytes.length, address, port);
//        发送数据
        dr.send(dg);
        dr.close();

    }
}
