package com._11_23._03泛型的继承和通配符;

import java.util.ArrayList;

// 泛型不具备继承性，但是数据具备继承性
public class index {
    public static void main(String[] args) {
        //创建对象集合
        ArrayList<fu> list = new ArrayList<>();
        ArrayList<zi> list1 = new ArrayList<>();
        ArrayList<sun> list2 = new ArrayList<>();
        mrthod1(list);
        // 相面会报错，因为传递的参数类型限定为fu
        //mrthod1(list1);
    }
    // 但是如果我们又希望传递可以继承的类作为属性
    // 可以把形成修改下一下
    // static<T> void mrthod(ArrayList<fu>list){
    //
    //    }

    static<T> void mrthod(ArrayList<? extends fu>list){

    }
    static void mrthod1(ArrayList<fu> list){

    }
}
class fu{}
class zi extends fu{}
class sun extends zi{}