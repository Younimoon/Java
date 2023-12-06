package com.example.pojo;

public class man {
    private String sex;

    public man() {
    }

    public man(String sex) {
        this.sex = sex;
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

    public String toString() {
        return "man{sex = " + sex + "}";
    }
}
