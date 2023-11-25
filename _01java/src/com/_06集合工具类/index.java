package com._06集合工具类;

import java.util.*;

public class index {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr1.add(13);

        arr.addAll(arr1);
        // addAll的源码解读:Collection<? extends E> 添加一个collection接口类型的数据 但是里面的数据必须是一个继承类型的类型或者是E本身类型
        //boolean addAll(Collection<? extends E> c);

        // 批量添加数据
        Collections.addAll(arr, 12312, 123123, 123213, 213213);

        //源码解读
        // 其中的Collection<? super T> c代表 coleection接口类型的数据必须是T或者T的父类
        //public static <T> boolean addAll(Collection<? super T> c, T... elements) {
        //    boolean result = false;
        //    for (T element : elements)
        //        result |= c.add(element);
        //    return result;
        //}
        System.out.println(arr);


        // 打乱数据
        Collections.shuffle(arr);
        System.out.println(arr);
        //排序
        // 默认升序排列
        Collections.sort(arr);
        System.out.println(arr);
        // 第二种sort方法
        // 源码解读
        //Comparator<? super T> c 需要一个接口类型的c ,内部类可以直接实现一个接口类型的数据
        // 所以这里就表示重写一个内部类，而且里面的方法就一个抽象方法
        //public static <T> void sort(List<T> list, Comparator<? super T> c) {
        //    list.sort(c);
        //}
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2- o1;
            }
        });
        System.out.println(arr);
        Collections.sort(arr);

        // 二分查找元素：注意：此方法必须将集合进行升序排列
        Integer a =   Collections.binarySearch(arr, 14);
        System.out.println(a);


        // 拷贝集合
        // cope(a,b)
        // 将b中的元素覆盖进a中相同的位置
        // 注意：b中的长度必须小于a，不然报错
        System.out.println(arr1+"-----------------"+arr);
        Collections.copy(arr,arr1);
        System.out.println(arr1+"-----------------"+arr);

        //使用指定的元素进行集合全覆盖
        Collections.fill(arr,124);
        System.out.println(arr);

        // 获取最大最小值
        Integer max =  Collections.max(arr);
        Integer min = Collections.min(arr);
        System.out.println(max+"__________________"+min);

        // 交换集合中指定元素
        Collections.swap(arr,1,2);
    }
}
