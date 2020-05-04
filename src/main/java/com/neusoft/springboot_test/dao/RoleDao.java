package com.neusoft.springboot_test.dao;

import com.neusoft.springboot_test.entity.RoleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: cxl
 * @Date: 2020/5/4 20:21
 */
@Repository
@Mapper
public interface RoleDao {

    /**
     * @Description: 新增角色
     * @author cxl
     * @param roleInfo
     * @return int
     * @date 2020-05-2
     */
    int saveRole(RoleInfo roleInfo);

    /**
     * @Description: 查询角色列表
     * @author cxl
     * @param roleInfo
     * @return int
     * @date 2020-05-2
     */
    List<RoleInfo> listRoleInfo(RoleInfo roleInfo);

    /**
     * @Description: 修改角色
     * @author cxl
     * @param roleInfo
     * @return int
     * @date 2020-05-2
     */
    int updateRole(RoleInfo roleInfo);

    /**
     * @Description: 假删除
     * @author cxl
     * @param roleInfo
     * @return int
     * @date 2020-05-2
     */
    int deleteRole(RoleInfo roleInfo);

    /**
     * @Description: 真删除
     * @author cxl
     * @param roleInfo
     * @return int
     * @date 2020-05-2
     */
    int deleteReallyRole(RoleInfo roleInfo);
}
