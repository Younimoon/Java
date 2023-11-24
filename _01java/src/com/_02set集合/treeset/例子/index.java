package com._02set集合.treeset.例子;

import java.util.Comparator;
import java.util.TreeSet;

public class index {
    public static void main(String[] args) {
        student stu1 = new student("张三", 90, 120, 101, 18);
        student stu2 = new student("张四", 91, 120, 100, 19);
        student stu3 = new student("张五", 92, 121, 81, 17);
        student stu4 = new student("张六", 90, 112, 110, 18);

        TreeSet<student> stuList = new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                System.out.println(o1 + "" + o2);
                return 1;
            }
        });
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        stuList.add(stu4);
        System.out.println(stuList);
    }
}

class student implements Comparable<student> {
    private String name;
    private int chinese;
    private int math;
    private int english;
    private int age;

    public student() {
    }

    public student(String name, int chinese, int math, int english, int age) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
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
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     *
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     *
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     *
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     *
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     *
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
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
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "student{name = " + name + ", chinese = " + chinese + ", math = " + math + ", english = " + english + ", age = " + age + "}";
    }
    @Override
    public int compareTo(student o) {
        return 0;
    }
}
