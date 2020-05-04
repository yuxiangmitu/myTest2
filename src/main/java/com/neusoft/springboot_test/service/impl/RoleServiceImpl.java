package com.neusoft.springboot_test.service.impl;

import com.neusoft.springboot_test.dao.RoleDao;
import com.neusoft.springboot_test.entity.RoleInfo;
import com.neusoft.springboot_test.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cxl
 * @Date: 2020/5/3 23:04
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public int insertRole (RoleInfo roleInfo){
        return  roleDao.saveRole(roleInfo);
    }

    @Override
    public List<RoleInfo> listRoleInfo(RoleInfo roleInfo){
        return  roleDao.listRoleInfo(roleInfo);
    }
    @Override
    public int updateRole(RoleInfo roleInfo){
        return  roleDao.updateRole(roleInfo);
    }
    @Override
    public int deleteRole(RoleInfo roleInfo){
        return  roleDao.deleteRole(roleInfo);
    }
    @Override
    public int deleteReallyRole(RoleInfo roleInfo){
        return  roleDao.deleteReallyRole(roleInfo);
    }
}