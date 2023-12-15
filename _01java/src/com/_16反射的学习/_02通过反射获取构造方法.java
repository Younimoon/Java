package com._16反射的学习;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class _02通过反射获取构造方法 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取demo对象的字节码文件对象
        demo d = new demo();
        Class abc = d.getClass();

        /**
         * 获取公共构造函数
         */
        Constructor[] constructors = abc.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        /**
         * 获取所有构造函数(什么修饰符的构造函数都获取)
         */
        Constructor[] declaredConstructors = abc.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        /**
         * 获取某个构造方法
         */
        Constructor declaredConstructor = abc.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);

        /**
         * 获取当前构造方法的修饰符对应的数字
         */
        int modifiers = declaredConstructor.getModifiers();
        System.out.println(modifiers);

        /**
         * 获取当前构造方法传入的参数类型
         */
        Parameter[] parameters = declaredConstructor.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        /**
         * 通过获取的构造函数创建实例对象
         */
        // 注意：如果我们想要创建实例的构造方法是一个私有的话，直接创建是报错
        // 如果非要创建，需要修改为可修改的权限
        // 临时修改
        declaredConstructor.setAccessible(true);
        Object demo1 = declaredConstructor.newInstance("黄伟鹏");
        System.out.println(demo1);


    }
}

class demo {
    private String name;
    private int age;

    public demo() {
    }

    public demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

   private demo(String name) {
        this.name = name;
    }

    private demo(int age) {
        this.age = age;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     *
     */
    private void call(String name){
        System.out.println("我是住"+name);
    }
    private void call(Integer name){
        System.out.println("我是住"+name);
    }
    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "demo{name = " + name + ", age = " + age + "}";
    }
}