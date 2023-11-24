package com._03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//map：双列集合，一次存取一对数据：分别是键和值
// 键不能重复，值可以重复
// 每个键值对都是一 一对应关系
//java中称键值对为entry对象
// map 为顶层接口
// map下面存在hashmap 和treemap
// hashmap下面还有linkedhashmap
public class index {
    public static void main(String[] args) {
        //map的api

        Map<String, String> map = new HashMap<>();

        //put(key, value): 向 Map 中插入键值对，如果键已经存在，则会覆盖原来的值，并返回被覆盖的值。

        // 注意：如果存在相同的key，后一个value会覆盖前一个value，且在后一个的返回值中返回前一个value
        // 如果不存在覆盖返回值为null
        map.put("name", "hungweipeng ");
        map.put("age", "12");
        String value = map.put("age", "man");
        System.out.println(value);// 12

        //get(key): 根据键获取对应的值，如果键不存在，则返回 null。
        String v1 = map.get("age");
        System.out.println(v1);

        //containsKey(key): 判断 Map 中是否包含指定的键，如果存在则返回 true，否则返回 false。

        //containsValue(value): 判断 Map 中是否包含指定的值，如果存在则返回 true，否则返回 false。

        //remove(key): 根据键移除键值对，并返回被移除的值。
        String result = map.remove("age");
        System.out.println(result);

        //清空集合
        //map.clear();

        //isEmpty(): 判断 Map 是否为空，如果为空则返回 true，否则返回 false。

        //size(): 返回 Map 的大小，即键值对的个数。

        //keySet(): 返回包含 Map 所有键的 Set 集合。
        Set<String> keys = map.keySet();
        System.out.println(keys);
        // 获取一个set的集合后可以进行遍历
        for (String key : keys) {
            System.out.println(key);
        }

        // lambda表达式遍历
        map.forEach((String key, String value2) -> {
            System.out.println(key + "123213dd" + value2);
        });


        //values(): 返回包含 Map 所有值的 Collection 集合。

        //entrySet(): 返回包含 Map 所有键值对的 Set 集合，每个键值对都是一个 Map.Entry 对象。

        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value1 = entry.getValue();
            System.out.println(key + value1);
        }
    }
}
