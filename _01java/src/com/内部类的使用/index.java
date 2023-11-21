package com.内部类的使用;

// 内部类：一个类的内部定义一个类
// 可以把外部类和内部类看成两个作用域，内部作用域可以访问外部作用域，反之不行
public class index {
    public static void main(String[] args) {
        outer car = new outer();
        car.carAge = 123;
        car.carName = "黄";
        car.show();
    }
}
class outer{
    String carName;
    int carAge;
    String carColor;
    void show(){
        System.out.println("hhhd"+this.carName);
        // 外部类想要访问内部类的成员变量与需要对内部类进行实例化
        inner engginer = new inner();
        System.out.println(engginer.engineerAge);

    }


    class inner{
        String engineerName;
        int engineerAge;
        void show(){
            System.out.println("hhhd"+this.engineerName);
        }
    }
}
