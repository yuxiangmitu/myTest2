package com.neusoft.springboot_test.dao;

import com.neusoft.springboot_test.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: cxl
 * @Date: 2020/5/2 19:45
 */
@Repository
@Mapper
public interface UserDao {

    /**
     * @Description: 新增用户
     * @author cxl
     * @param userInfo
     * @return int
     * @date 2020-05-2
     */
    int saveUser(UserInfo userInfo);

    /**
     * @Description: 查询列表
     * @author cxl
     * @param userInfo
     * @return int
     * @date 2020-05-2
     */
    List<UserInfo> listUserInfo(UserInfo userInfo);

    /**
     * @Description: 修改用户
     * @author cxl
     * @param userInfo
     * @return int
     * @date 2020-05-2
     */
    int updateUser(UserInfo userInfo);

    /**
     * @Description: 假删除
     * @author cxl
     * @param userInfo
     * @return int
     * @date 2020-05-2
     */
    int deleteUser(UserInfo userInfo);

    /**
     * @Description: 真删除
     * @author cxl
     * @param userInfo
     * @return int
     * @date 2020-05-2
     */
    int deleteReallyUser(UserInfo userInfo);
}
