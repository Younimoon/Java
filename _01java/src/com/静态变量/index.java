package com.静态变量;

public class index {
    public static void main(String[] args) {
        User stu1 = new User();
        System.out.println(stu1.teacher);
    }
}
//对于多个使用共同类的对象且有一个属性的值都是一样的话就可以使用静态变量
// 比如一个学生信息的类，他们的老师都是一样的
// 所以老师就可以使用静态变量
class User{
    String name;
    String sex;
    //String
    int age;
    static String teacher = "黄伟鹏";
    public User() {
    }

    public User(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{name = " + name + ", sex = " + sex + ", age = " + age + "}";
    }
}