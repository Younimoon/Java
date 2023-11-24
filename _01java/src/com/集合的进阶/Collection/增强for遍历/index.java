package com.集合的进阶.Collection.增强for遍历;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

// 增强for底层也是迭代器，为了简化迭代器的代码书写
// 所有的单列结合和数组才能使用迭增强for进行遍历
public class index {
    public static void main(String[] args) {
        //格式如下
        //for(数据类型 变量名称： 集合/数组){}

        //创建集合
        String[] str = {"张三", "李四", "王五"};
        Collection<String> cool = new ArrayList<>(Arrays.asList(str));
        //快捷键 集合/数组名.for
        for (String s :cool){
            // s表示集合中的每一个元素
            // s为第三方变量，说白了就是把当前的变量赋值给s
            // 所以修改s无法改变cool集合
            System.out.println(s);
            s = "123123";
        }
        System.out.println(cool);
    }
}
