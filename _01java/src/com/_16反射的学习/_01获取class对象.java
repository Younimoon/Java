package com._16反射的学习;


// 注意：在内部的成员变量，构造函数，成员方法，涉及到成员变量和方法的修改或者构造函数的新增实例对象
// 都要看当前的是否为私有的，如果是私有的就需要添加权限认证api

public class _01获取class对象 {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 通过反射获取类
         */


        // 方法一：Class.forName("com._16反射的学习._被调用的类");
        Class aClass = Class.forName("com._16反射的学习._被调用的类");
        System.out.println(aClass);

        // 方法二： 类名.class
        Class<_被调用的类> bClass = _被调用的类.class;
        System.out.println(bClass);

        //方法三
        _被调用的类 _1 = new _被调用的类();
        Class cClass = _1.getClass();
        System.out.println(cClass);
    }
}
