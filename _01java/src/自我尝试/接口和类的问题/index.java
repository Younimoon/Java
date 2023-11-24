package 自我尝试.接口和类的问题;

public class index {
    public static void main(String[] args) {
        // 多态
        // 1.接口可以为实现类的父类
        // 2.创建一个多态时，创建对象的，必须重写父类方法
        person p = new per();
        p.call();
        per P = new per();
        P.call();
        P.teach();
    }
}
interface person {
    void call();
}

class per implements person{
    @Override
    public void call(){
        System.out.println("我实现了");
    }
    void teach(){
        System.out.println("我可以教书育人了");
    }

}


