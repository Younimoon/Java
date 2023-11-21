package com.抽象类和接口的结合例子;

public class PingPong extends spotter implements English{
    @Override
    public void speakEnglish() {
        System.out.println("乒乒球运动员说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乒球运动员学习乒乓球");
    }
}

class basketball extends coach implements English{
    @Override
    public void teach() {
        System.out.println("篮球运动员说英语");
    }

    @Override
    public void speakEnglish() {
        System.out.println("篮球运动员学习乒乓球");
    }
}

class ppCoach extends coach {
    @Override
    public void teach() {
        System.out.println("我是教乒乓球的");
    }
}
class bskCoach extends coach{

    @Override
    public void teach() {
        System.out.println("我是教篮球的");
    }
}

