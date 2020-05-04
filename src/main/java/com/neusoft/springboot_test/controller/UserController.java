package com.neusoft.springboot_test.controller;

import com.neusoft.springboot_test.entity.UserInfo;
import com.neusoft.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @Author: cxl
 * @Date: 2020/5/3 15:14
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    public int insertUser(UserInfo userInfo){
        //对参数进行一些简单处理
        userInfo.setCreateBy("a");
        userInfo.setIsDeleted(0);
        userInfo.setId(UUID.randomUUID().toString());
        return userService.insertUser(userInfo);
    }

    @RequestMapping("/listUserInfo")
    public List listUserInfo(UserInfo userInfo){
        return userService.listUserInfo(userInfo);
    }
    @RequestMapping("/updateUser")
    public int updateUser(UserInfo userInfo){
        return userService.updateUser(userInfo);
    }
    @RequestMapping("/deleteUser")
    public int deleteUser(UserInfo userInfo){
        return userService.deleteUser(userInfo);
    }
    @RequestMapping("/deleteReUser")
    public int deleteReUser(UserInfo userInfo){
        return userService.deleteReallyUser(userInfo);
    }
}
