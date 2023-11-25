package com._05综合项目.map相关的案例;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// 注意：对于map  想要进行遍历必须转化为set 使用keyset 或者entreset方法
public class index {
    public static void main(String[] args) {
        //定义一个map集合
        // 键是省份名称，值代表city，但是city存在多个
        // 添加的正确格式如下
        // 江苏省=南京市，万州市，
        Map<String, List<String>> provinceCityMap = new HashMap<>();

        // 添加省份和城市
        addCityToProvince(provinceCityMap, "江苏省", "南京市");
        addCityToProvince(provinceCityMap, "江苏省", "苏州市");
        addCityToProvince(provinceCityMap, "江苏省", "无锡市");

        addCityToProvince(provinceCityMap, "重庆市", "渝中区");
        addCityToProvince(provinceCityMap, "重庆市", "渝北区");
        addCityToProvince(provinceCityMap, "重庆市", "万州市");
        System.out.println(provinceCityMap);
        // 打印所有省份和城市
        for (String province : provinceCityMap.keySet()) {
            List<String> cities = provinceCityMap.get(province);

            //String.join(a,b)
            //当我们需要把一组字符串(b)按照指定分隔符(a)连接起来时，
            System.out.println(province + "=" + String.join(",", cities));
        }
    }

    public static void addCityToProvince(Map<String, List<String>> map, String province, String city) {
        if(!map.containsKey(province)){
            List<String> list = new ArrayList<>();
            map.put(province, list);
        }
        // 获取当前key的value
        List<String> list = map.get(province);
        // 向当前的list中添加城市
        list.add(city);
    }
}
