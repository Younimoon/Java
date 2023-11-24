package com._03map.treemap.利用treemap进行统计;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class index {
    public static void main(String[] args) {
        // 统计“asdasdasdqeweqtrsdffsd” 字符每个字符出现的次数
        // 返回值如下
        // a(5)  b(6)...

        String str = "qweasdzxcasdsadas";
        HashMap<Character, Integer> map = new HashMap<>();

        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            // 对 c 进行操作
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value++;
                map.put(c, value);
                //return;
            } else {
                map.put(c, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey() + "(" + entry.getValue() + ")");
        }
    }
}
