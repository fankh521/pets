package com.neno.pets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neno.pets.model.User;
import com.neno.pets.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value={"/getUserList"}, method=RequestMethod.POST)
    public List<User> getUserList(){
        System.out.println("查询用户信息。。。。。。。。。");
        return userService.getAll();
    }

    @RequestMapping(value={"/addUser"}, method=RequestMethod.POST)
    @ResponseBody
    public void addUser(@RequestBody User user){
        System.out.println("开始新增。。。。。。。。。。。。。。");
        userService.insert(user);
    }

    @RequestMapping(value={"/updateUser"}, method=RequestMethod.POST)
    @ResponseBody
    public void updateUser(@RequestBody User user){
        System.out.println("开始修改信息。。。。。。。。");
        userService.update(user);
    }

    @RequestMapping(value={"/deleteUser"}, method = RequestMethod.POST)
    @ResponseBody
    public void deleteUser(@RequestBody String id){
        System.out.println("开始删除信息。。。。。。。。");
        userService.delete(id);
    }
    
    @RequestMapping(value={"/findUser"}, method = RequestMethod.POST)
    @ResponseBody
    public void findUser(@RequestBody String id){
        System.out.println("根据ID查询信息。。。。。。。。");
        userService.find(id);
        
    }
}
