package com._11_23._02泛型;

import java.util.ArrayList;
import java.util.Iterator;

// 约束操作的数据类型并且进行检查
// 泛型仅支持引用数据类型
// Integer是int的包装类
public class index {
    public static void main(String[] args) {
        // 没有泛型
        // 如果没有添加泛型，会默认为object类型，
        // 缺点：在获取数据时，无法获取数据的特有行为
        ArrayList list = new ArrayList();
        list.add(123);
        list.add("1232");
        //可以随意添加类型

        // 泛型的推出，可以在添加数据的时候把类型进行统一
        // 而且我们在获取数据的方法的时候，也不用去强壮，非常的方便
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object str = it.next();
            //String str = (String) it.next();
        }
        ArrayList<String> list1 = new ArrayList();
        list1.add("1");
        list1.add("1232");
        // 不添加泛型默认是object
        Iterator<String> it1 = list1.iterator();
        while (it1.hasNext()) {
            // 无法推导到string，默认是object，然后如果想使用string类型特有的api就会失败
            // 不写泛型默认为对象类型
            String abc = it1.next();
            abc.length();
        }

        ArrayList<String> list3 = new ArrayList<>();
        myArrayList.addAll(list3,"123");
    }
}

class abc {
    // 泛型的细节
    // 不能是基本数据类型
    //  泛型确定的时候，可以传递该数据类型或其子类型
    void cba() {
        // 泛型可以写在类，方法，接口后面

    }
}

//1泛型类
// 类名<E>{}
class myArrayList<E> {
    Object[] obj = new Object[10];
    int size;

    boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    ;

    E get(int index) {
        return (E) obj[index];
    }

    // 2泛型方法
    // <T> void show(T t){}
    static <T> void addAll(ArrayList<T> list, T ...a) {
        list.add((T) a);
        System.out.println(list.get(0));
    }
}

// 泛型接口
// 使用方法
// 1 实现类给具体类型
class mst implements per<String>{
    @Override
    public void call(String sb) {

    }
}
// 2 实现类延续泛型 创建对象时再确定
class mst2<T> implements per<T>{
    @Override
    public void call(T sb) {

    }
}

interface per<S>{
    void call(S sb);
}
