package com._11_23.linkedList;

import java.util.LinkedList;
// list 和linkedlist的关系：后者是前者的实现类
public class index {
    //linkedlist集合：数据结构地城是双向链表：首尾操作极快，所以多出很多操作首尾的api
    // 一个双链表的每个节点都包括：当前节点的值，下一个节点的地址和上一个节点的地址
    public static void main(String[] args) {
        //List<String> list = new LinkedList<>();
        // 因为addFirst为linkedlist的特有方法，所以如果写list作为父类是无法使用该方法的
        LinkedList<String> list = new LinkedList<>();
        //添加元素：
        //
        //add(element)：将元素添加到链表末尾。
        list.add("黄");
        list.add("黄威");
        list.add("黄威鹏");

        //add(index, element)：将元素添加到指定索引位置。(index必须是0-list.lenght之间)
        list.add(3, "黄哥");

        //addFirst(element)：将元素添加到链表的开头。
        list.addFirst("weipeng ");

        //addLast(element)：将元素添加到链表的末尾。
        list.addLast("黄黄黄");

        //获取元素：
        //
        //get(index)：获取指定索引处的元素。
        String str = list.get(1);
        System.out.println(str + "111111111");

        //getFirst()：获取链表的第一个元素。
        String Str = list.getFirst();
        System.out.println(Str);
        System.out.println(list);

        //getLast()：获取链表的最后一个元素。

        //删除元素：
        //
        //remove(index)：删除指定索引处的元素。
        //removeFirst()：删除链表的第一个元素。
        //removeLast()：删除链表的最后一个元素。
        //遍历元素：
        //
        //forEach(action)：对链表中的每个元素执行指定的操作。
        //iterator()：返回一个迭代器对象，用于遍历链表中的元素。
        //查询元素：
        //
        //contains(element)：检查链表是否包含指定元素。
        //indexOf(element)：返回指定元素在链表中的第一次出现的索引。
        //lastIndexOf(element)：返回指定元素在链表中最后一次出现的索引。
        //获取链表大小：
        //
        //size()：返回链表中元素的个数。
    }
}
