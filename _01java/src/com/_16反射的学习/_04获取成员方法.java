package com._16反射的学习;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class _04获取成员方法 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 获取demo对象的字节码文件对象
        demo d = new demo();
        Class abc = d.getClass();

        /**
         * 获取成员方法（公共的）
         */
        Method[] methods = abc.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        /**
         * 获取所有的成员方法（包括非公共的）
         */
        Method[] declaredMethods = abc.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        /**
         * 获取某个成员方法（公共的）
         */
        Method toString = abc.getMethod("toString");
        System.out.println(toString);
        System.out.println(toString);


        /**
         * 获取某个成员方法（可以是不公共的）
         */
        Method call = abc.getDeclaredMethod("call",String.class);
        System.out.println(call);

        // 获取方法的名字，参数，权限修饰符和构造函数的api一样

        // 获取抛出的异常类型
        Class<?>[] exceptionTypes = call.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        // 私有方法必须添加权限认证
        call.setAccessible(true);
        // 运行获取的方法
        call.invoke(d, "黄");

    }
}
