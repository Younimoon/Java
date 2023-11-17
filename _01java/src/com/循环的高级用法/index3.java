package com.循环的高级用法;

public class index3 {
    public static void main(String[] args) {
        // for的无限循环
        //for (; ; ) {
        //    System.out.println(123);
        //}
        // continue是终止当前循环
        // break 终止循环 return 效果是一样的
        for (int i = 0; i < 5; i++) {
            //if(i==3)return;
            if (i == 3) break;
            //System.out.println(i);
        }
        // eg：1-100有7的倍数打印该数字
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7   ) {
                System.out.println(i);
            }
        }


    }
}
