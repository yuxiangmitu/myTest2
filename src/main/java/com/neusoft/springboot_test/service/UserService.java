package com.neusoft.springboot_test.service;

import com.neusoft.springboot_test.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cxl
 * @Date: 2020/5/2 21:16
 */
@Service
public interface UserService {

    /**
     * @Description: 新增用户
     * @author: cxl
     * @date: 2020/5/2
     */
    int insertUser(UserInfo userInfo);
    List listUserInfo(UserInfo userInfo);
    int updateUser(UserInfo userInfo);
    int deleteUser(UserInfo userInfo);
    int deleteReallyUser(UserInfo userInfo);
}
