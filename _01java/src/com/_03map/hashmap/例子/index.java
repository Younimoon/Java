package com._03map.hashmap.例子;

import java.util.*;

public class index {
    public static void main(String[] args) {
        // 在长度为80的数组中只有a，b，c，d4中元素
        // 判断哪个元素存在最多
        //0<= math.random <1
        String[] randomlist = {"a", "b", "c", "d"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            int random = (int) (Math.random() * 4);
            list.add(randomlist[random]);
        }
        HashMap<String, Integer> sum = new HashMap<String, Integer>();


        list.forEach(e -> {
            if (sum.containsKey(e)) {
                int value = sum.get(e);
                value++;
                sum.put(e, value);
            } else {
                sum.put(e, 1);
            }
        });
        System.out.println(sum);
        Set<Map.Entry<String, Integer>> entries = sum.entrySet();
        List<Map.Entry<String, Integer>> lists = new ArrayList<>(entries);


        //Set<Map.Entry<String, Integer>> entries = sum.entrySet();
        //List<Map.Entry<String, Integer>> lists = new ArrayList<>(entries);

        int num = lists.get(0).getValue();
        String str = lists.get(0).getKey();

        for (Map.Entry<String, Integer> entry : lists) {
            if (num < entry.getValue()) {
                num = entry.getValue();
                str = entry.getKey();
            }
        }

        System.out.println(num + str);

    }
}
