package com._09方法引用.引用成员方法;

// 成员方法的引用： 对象：：成员方法

import java.util.ArrayList;
import java.util.Collections;

// 其他类的成员方法： 其他类:method（）
// 本类的 ：this:method()
// 父类的 ：super:method()

public class index extends  father{
    public static void main(String[] args) {
        // 案例1：以下字符串只需要以a开头且长度为3的
        ArrayList<String> lisr = new ArrayList<>();
        Collections.addAll(lisr, "abc", "ab", "asd", "rwer", "adsd", "asd", "asd");
        lisr.stream().filter(e -> e.length() == 3 && e.startsWith("a")).forEach(e -> System.out.println(e));
        lisr.stream().filter(index::filter).forEach(e -> System.out.println(e + "引用成员"));

        // 其他类
        test test = new test();
        lisr.stream().filter(test::filter).forEach(e -> System.out.println(e + "引用成员"));

        // 因为是在静态代码块中实现的所以不存在this还有super
        // 如果想使用本类的方法可以把this改成 new 本类名（）或者new 父类名（）
        lisr.stream().filter(new index()::filter1).forEach(e -> System.out.println(e + "引用成员"));
        lisr.stream().filter(new father()::filter1).forEach(e -> System.out.println(e + "引用成员"));

    }

    static boolean filter(String e){
        return e.length() == 3 && e.startsWith("a");
    }
    boolean filter1(String e){
        return e.length() == 3 && e.startsWith("a");
    }

}

// 其他类的方法

class test{
    boolean filter(String e){
        return e.length() == 3 && e.startsWith("a");
    }
}
class father{
    boolean filter1(String e){
        return e.length() == 3 && e.startsWith("a");
    }
}