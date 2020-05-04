package com.neusoft.springboot_test.service.impl;

import com.neusoft.springboot_test.dao.UserDao;
import com.neusoft.springboot_test.entity.UserInfo;
import com.neusoft.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cxl
 * @Date: 2020/5/2 21:46
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(UserInfo userInfo) {
        //写业务逻辑
        String userName = userInfo.getUserName();
        if(null != userName && !"".equals(userName)){
            userName = userName + "aaa";
            userInfo.setUserName(userName);
        }
        return userDao.saveUser(userInfo);
    }

    @Override
    public List<UserInfo> listUserInfo(UserInfo userInfo){
        String sex=userInfo.getSex();
        if("0".equals(sex)){
            sex="女";
            userInfo.setSex(sex);
        }
        else {
            sex="男";
            userInfo.setSex(sex);
        }
        return  userDao.listUserInfo(userInfo);
    }

    @Override
    public int updateUser(UserInfo userInfo){
        return  userDao.updateUser(userInfo);
    }

    @Override
    public int deleteUser(UserInfo userInfo){
        return  userDao.deleteUser(userInfo);
    }

    @Override
    public int deleteReallyUser(UserInfo userInfo){
        return  userDao.deleteReallyUser(userInfo);
    }
}
