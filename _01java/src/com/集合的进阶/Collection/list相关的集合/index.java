package com.集合的进阶.Collection.list相关的集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class index {
    public static void main(String[] args) {
        // list特有的方法
        //add(index,name) 插入元素
        // remove :删除指定位置（或指定的）的元素，
        // set：改 返回值为被修改的元素
        // get :查
        List<String> list = new ArrayList<>();
        list.add("黄");
        list.add("威鹏");
        list.add(1,"鹏哥");

        // remove方法有两种（重载），如果remove的参数为int类型，会把参数当成索引
        // 如果数据类型非int会优先调用把参数作为需要移除的元素的方法

        // 注意：如果元素类型也是也是int类型，那么我们想直接传入需要移除的元素而非索引时
        // 转换如下
        //Integer a = Integer.valueOf(1);
        String a = list.remove(1);
        list.remove("黄");
        System.out.println(list);
        Object str =  list.set(0, "我被修改了");
        Object Str = list.get(0);
        System.out.println(Str);
        System.out.println(str);
        System.out.println(a);
        System.out.println(list);

        list li = new list();
        li.bianli();
    }
}
//list的五种遍历
class list{
    void bianli(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("12");
        list.add("13");
        // 迭代器
        Iterator<String> it =  list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        // 增强for
        for (String s : list) {
            System.out.println(s);
        }
        // lambda遍历
        //list.forEach(new Consumer<String>() {
        //    @Override
        //    public void accept(String s) {
        //        System.out.println(s);
        //    }
        //});
        list.forEach(s-> System.out.println(s));
        // 普通for循环（比较简单不写了）

        // 列表迭代器
        ListIterator<String> i = list.listIterator();
        if(i.hasNext()){
            String str = i.next();
            if("1".equals(str)){
                i.add("qqq");
            }
        }
        System.out.println(list);
    }

}
