package com._05综合项目.点名器;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class index {
    public static void main(String[] args) {
        ArrayList<String> stuList = new ArrayList<>();
        // 随机打印某个字符串
        Collections.addAll(stuList, "h", "asd", "qwe", "asdxzc", "oiu", "q", "jlk");
        //方法一
        Random random = new Random();
        int index = random.nextInt(stuList.size());
        String name = stuList.get(index);
        System.out.println(name);

        // 方法二，打乱集合，打印第一个
        Collections.shuffle(stuList);
        System.out.println(stuList.get(0));


        abc a = new abc();
        a.aaa();
    }
}

class abc {
    void cba() {
        // 70%抽到男生
        // 30%抽到女生

        // 把男女分区
        // 在写一个10个数的集合7个1，3个0
        // 随机抽取一个 如果为1 就去男区随机抽取一个数，女区同理
    }

    void aaa() {
        // 被点到的学生不会再次点到
        // 选中就移除就行
        // 主要考察remove方法

        ArrayList<String> stuList = new ArrayList<>();
        // 随机打印某个字符串
        Collections.addAll(stuList, "h", "asd", "qwe", "asdxzc", "oiu", "q", "jlk");
        //
        stuList.remove("h");
        System.out.println(stuList);
    }
}