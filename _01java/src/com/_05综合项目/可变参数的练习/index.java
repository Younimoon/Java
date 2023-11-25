package com._05综合项目.可变参数的练习;

public class index {
    public static void main(String[] args) {

        getSum(1, 2, 2, 4, 4);

    }
    // 我们称类型 ...args为可变参数
    // 注意：在方法中我们只能存在一个可变参数
    // 且如果还有其他参数，可变参数必须写最后
    static int getSum(int a,int...args){
        System.out.println(args);
        // args是一个数组
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        System.out.println(sum);
        return sum;
    };
}
