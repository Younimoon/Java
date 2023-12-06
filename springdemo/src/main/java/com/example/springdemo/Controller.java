package com.example.springdemo;

import com.example.pojo.Username;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @RequestMapping("/hello")
    public String hello() {
        return "我啊你";
    }
}

// 实体传参
// 空为null
@RestController
class Controller1 {
    @RequestMapping("/hello1")
    public String hello(Username user) {
        System.out.println(user);
        return "";
    }
}

// 数组参数
// 传入的参数名必须是hobbies
@RestController
class Controller2 {
    @RequestMapping("/hello2")
    public String hello(String[] hobbies) {
        System.out.println(Arrays.toString(hobbies));
        return "";
    }
}
//集合参数
// 需要添加注解在形参前面
// 添加注解的原因;因为默认会转化为数组类型
// 形参名必须和请求参数名一致
@RestController
class Controller3 {
    @RequestMapping("/hello3")
    public String hello(@RequestParam List<String> hobbies) {
        System.out.println(hobbies);
        return "";
    }
}

// 日期参数
// pattern的参数格式决定了前端能传输的日期格式
@RestController
class Controller4 {
    @RequestMapping("/hello4")
    public String hello(@DateTimeFormat(pattern = "yyyy-MM-dd-HH:mm:ss")LocalDateTime time) {
        System.out.println(time);
        return "ok";
    }
}