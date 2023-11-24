package com._03map.treemap.键改为自定义对象;

import java.util.TreeMap;

public class index {
    public static void main(String[] args) {
        // 按照id进行排序，id一样的视为一个人
        goods gd1 = new goods("番茄", 123);
        goods gd2 = new goods("土豆", 1231);
        goods gd3 = new goods("红苕", 13);
        TreeMap<goods, String> map = new TreeMap<>();
        map.put(gd1, "万州");
        map.put(gd2, "重庆");
        map.put(gd3, "无锡");
        System.out.println(map);
    }
}
class goods implements Comparable<goods>{
    private String name;
    private int id;

    public goods() {
    }

    public goods(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "goods{name = " + name + ", id = " + id + "}";
    }

    @Override
    public int compareTo(goods o) {
        // this表示当前需要添加的元素
        // o:表示已经在红黑树中存在的元素
        // return 的是一个负数：当前添加的元素是小的，存在左边
        // return 的是一个正数  表示当前添加的元素是大的 存在右边
        // return 0 ，底层直接舍弃
        System.out.println(this.id);
        System.out.println(o);
        Integer result = this.id - o.id;

        // 我们的需求，如果id一样判断字符串
        if(result==0){
            result = this.getName().compareTo(o.getName());
        }
        return result;
    }
}