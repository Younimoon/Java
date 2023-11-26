package com._09方法引用.基本使用;


import java.util.Arrays;
import java.util.Comparator;

// 方法引用：把已经有的方法拿过来用，当作函数式接口中抽象方法的方法体
public class index {
    public static void main(String[] args) {

        //例子：创建一个数组，进行倒序排序
        //ArrayList<Integer> list = new ArrayList<>();
        //Collections.addAll(list, 1, 3, 45, 1312, 2, 2134, 2, 1, 23, 123);
        Integer[] list = {1, 3, 45, 1312, 2, 2134, 2, 1, 23, 123};
        Arrays.sort(list,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o2 - o1;
            }
        });

        // lambda表达式
        Arrays.sort(list, (Integer o1, Integer o2) -> o2 - o1);

        // 方法引用
        // 引用处，正常传递是传递的函数式接口
        // 被引用的方法的参数类型和原来定义的抽象方法的参数保持一致
        // 被引用的必须满足需求
        // 格式 类名：：方法名字
        Arrays.sort(list, index::recompare);
    }
    static int recompare(int num1,int num2){
        return num2 - num1;
    }
}
