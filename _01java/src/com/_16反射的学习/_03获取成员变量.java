package com._16反射的学习;

import java.lang.reflect.Field;

public class _03获取成员变量 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 获取demo对象的字节码文件对象
        demo d = new demo();
        Class abc = d.getClass();

        /**
         * 获取成员变量
         */
        // 获取所有成员变量
        Field[] declaredFields = abc.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        // 获取共有成员变量
        Field[] fields = abc.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 获取共有变量
        //abc.getField()

        // 获取变量(所有变量都可获取)
        Field field = abc.getDeclaredField("name");
        System.out.println(field);

        // 获取变量的权限修饰符数字
        System.out.println(field.getModifiers());

        //获取该变量的所接收的成员变量名字
        System.out.println(field.getName());

        // 获取该变量的所接收的成员变量类型
        System.out.println(field.getType());

        //获取这个变量接收的成员变量被实例化后接收的值
        demo d1 = new demo("younimoon", 20);
        //私有变量无法直接得到值
        field.setAccessible(true);
        Object o = field.get(d1);
        System.out.println(o);

        // 修改成员变量记录的值
        field.set(d1,"huang");
        System.out.println(field.get(d1));
        System.out.println(d1);
    }
}
