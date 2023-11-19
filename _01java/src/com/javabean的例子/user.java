package com.javabean的例子;

public class user {
    private String User;
    private Number PassWord;
    private Number confirm_Number;
    private String Email;
    private String gender;
    private int age;

    public user() {
    }

    public user(String User, Number PassWord, Number confirm_Number, String Email, String gender, int age) {
        this.User = User;
        this.PassWord = PassWord;
        this.confirm_Number = confirm_Number;
        this.Email = Email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return User
     */
    public String getUser() {
        return User;
    }

    /**
     * 设置
     * @param User
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * 获取
     * @return PassWord
     */
    public Number getPassWord() {
        return PassWord;
    }

    /**
     * 设置
     * @param PassWord
     */
    public void setPassWord(Number PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * 获取
     * @return confirm_Number
     */
    public Number getConfirm_Number() {
        return confirm_Number;
    }

    /**
     * 设置
     * @param confirm_Number
     */
    public void setConfirm_Number(Number confirm_Number) {
        this.confirm_Number = confirm_Number;
    }

    /**
     * 获取
     * @return Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * 设置
     * @param Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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
        return "user{User = " + User + ", PassWord = " + PassWord + ", confirm_Number = " + confirm_Number + ", Email = " + Email + ", gender = " + gender + ", age = " + age + "}";
    }


    // 快捷键：alt+insert（快速生成空参有参getter,setter）

    //空参
    //public user() {
    //
    //}

    //public user(String User, Number PassWord, Number confirm_Number, String Email, String gender, int age) {
    //    this.User = User;
    //    this.PassWord = PassWord;
    //    this.confirm_Number =  confirm_Number ;
    //    this.gender = gender;
    //    this.Email = Email;
    //    this.age = age;
    //
    //}

}


