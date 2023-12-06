package com.example.pojo;

public class Username {
    private String name;
    private String age;
    private man man;


    public Username() {
    }

    public Username(String name, String age, man man) {
        this.name = name;
        this.age = age;
        this.man = man;
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
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 获取
     * @return man
     */
    public man getMan() {
        return man;
    }

    /**
     * 设置
     * @param man
     */
    public void setMan(man man) {
        this.man = man;
    }

    public String toString() {
        return "Username{name = " + name + ", age = " + age + ", man = " + man + "}";
    }
}
