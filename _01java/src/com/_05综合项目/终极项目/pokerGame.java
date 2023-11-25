package com._05综合项目.终极项目;

import java.util.ArrayList;
import java.util.Collections;

public class pokerGame {
    static ArrayList<String> list = new ArrayList<>(); // 成员变量
    // 准备牌

    // 静态代码块只能处理静态资源，静态代码块是一个独立的作用域
    // 在下面的方法中访问静态代码块的内部定义的变量是无法访问的
    static {
        String[] color = {"♠", " ♥", " ♦", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k", "a", "2",};
        // 牌盒子
        // 一张牌存在一个花色 ＋ 一个数字
        for (String s : color) {
            for (String s1 : number) {
                String str = s1 + s;
                list.add(str);
            }
        }
        list.add("大王");
        list.add("小王");
    }

    public pokerGame() {
        // 洗牌
        Collections.shuffle(list);
        System.out.println(list.size());
        // 发牌
        // 三个人打牌，创建四个集合
        ArrayList<String> per1 = new ArrayList<>();
        ArrayList<String> per2 = new ArrayList<>();
        ArrayList<String> per3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();


        // 看牌
    }
}
