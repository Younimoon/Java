package com.lambda;

// 注意事项
// lambda表达式可以用来简化内部类的书写
// lambda表达式只能简化函数式接口的匿名内部类的写法
// 有且只有一抽象方法的接口叫函数式接口
public class index {
    public static void main(String[] args) {
        // 传统方式
        swimer swimer = new swimer();
        method(swimer);
        // 当一个方法传入的参数类型是一个接口,我们需要传入的则是接口的实现类
        // 当接受的实现类的抽象类只有一个的话我们就可以使用匿名内部类（多个抽象类也是可以是匿名内部类）
        // 因为lambda表达式只能接收一个抽象方法
        // 匿名内部类：
        //method(new Swim() {
        //    @Override
        //    public void swim() {
        //        System.out.println("我休要重新给i额");
        //    }
        //
        //    //@Override
        //    //public void eat() {
        //    //
        //    //}
        //});

        // 只有一个接口
        method(()->{
            System.out.println("我是lambda表达式");
        });

        // 梳理一下：有一个需要传入接口类型的方法
        // 调用该方法需要通过类实现该方法
        // 因为这个接口只会使用一次我们可以通过匿名内部类的方式进行接口方法的重写
        // 因为接口方法只存在一个我们就可以使用lambda的方式
    }

    static void method(Swim s) {
        s.swim();
    }

}

interface Swim {
    void swim();
    //void eat();
}

// 传统方式
class swimer implements Swim {
    @Override
    public void swim() {
        System.out.println("Ssadas");
    }

    //@Override
    //public void eat() {
    //
    //}
}


