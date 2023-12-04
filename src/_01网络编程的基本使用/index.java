package _01网络编程的基本使用;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class index {
    public static void main(String[] args) throws UnknownHostException {
//        System.out.println(123);
        InetAddress address = InetAddress.getByName("www.baidu.com");
        String name = address.getHostName();
        String ip = address.getHostAddress();
        InetAddress address1 = InetAddress.getByName("172.16.10.179");
        String name1 = address1.getHostName();
        String ip1 = address1.getHostAddress();
        System.out.println("主机名--------" + name + "ip" + ip);
        System.out.println("主机名--------" + name1 + "ip" + ip1);
    }
}
