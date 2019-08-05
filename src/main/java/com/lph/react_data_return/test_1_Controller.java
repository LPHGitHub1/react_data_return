package com.lph.react_data_return;

import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.Map;

import static java.lang.Character.getType;

@RestController
/*react 跨域时添加*/
@CrossOrigin(origins = "*", maxAge = 3600)
public class test_1_Controller {
    @RequestMapping("test_1")
    public User test_1(){

        User user = new User();
        user.setName("zhangsan");
        user.setAge(12);
        System.out.println("来了");
        // 自动转换成json
        return user;
    }

    @RequestMapping("test_2")
    public String test_2(){
        return "这是返回数据！！！";
    }

    @RequestMapping("test_4")
    public User[] test_4(){

        User user1 = new User();
        user1.setName("zhangsan");
        user1.setAge(12);
        user1.setAddr("大街");

        User user2 = new User();
        user2.setName("lisi");
        user1.setAge(18);
        user1.setAddr("桥下");

        User user3 = new User();
        user3.setName("wangwu");
        user1.setAge(31);
        user1.setAddr("树下");

        User[] arr = {user1,user2, user3};

        return arr;
    }

    @RequestMapping(value = "test_5", method=RequestMethod.POST)
    public void test_5(@RequestBody Map map){

        System.out.println(map.get("name"));
        System.out.println(map.get("name"));

    }

    @RequestMapping(value = "test_6", method=RequestMethod.POST)
    public void test_6(@RequestBody User user){
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }

    @RequestMapping(value = "listInit")
    public User[] listInit(){
        User user1 = new User();
        user1.setName("张三");
        user1.setAge(12);
        user1.setAddr("大街");

        User user2 = new User();
        user2.setName("李四");
        user2.setAge(18);
        user2.setAddr("桥下");

        User user3 = new User();
        user3.setName("王五");
        user3.setAge(31);
        user3.setAddr("树下");

        User[] usersarr = {user1,user2, user3};

        return usersarr;
    }
}
