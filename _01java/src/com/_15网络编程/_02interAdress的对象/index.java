package com._15网络编程._02interAdress的对象;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class index {
    public static void main(String[] args) throws UnknownHostException {

        // 获取InterAdress对象

        // 表示一个ip的对象，也叫一台电脑的对象
        InetAddress address = InetAddress.getByName("192.168.31.238");
        System.out.println(address);

        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println(name + "ip" + ip);
    }
}
