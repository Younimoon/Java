package com._11_23._01arraylist集合;

import java.util.ArrayList;

public class index {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("黄");
        list.add("威");
        list.add("鹏");

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);
    }

}
