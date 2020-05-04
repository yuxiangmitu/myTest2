package com.neusoft.springboot_test.controller;

import com.neusoft.springboot_test.entity.RoleInfo;
import com.neusoft.springboot_test.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @Author: cxl
 * @Date: 2020/5/3 22:51
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/insertRole")
    public int insertRole(RoleInfo roleInfo){
        roleInfo.setCreateBy("b");
        roleInfo.setIsDeleted(0);
        roleInfo.setRoleId(UUID.randomUUID().toString());
        return roleService.insertRole(roleInfo);
    }

    @RequestMapping("/listRoleInfo")
    public List listRole(RoleInfo roleInfo){
        return roleService.listRoleInfo(roleInfo);
    }

    @RequestMapping("/updateRole")
    public int updateRole(RoleInfo roleInfo){
        return roleService.updateRole(roleInfo);
    }

    @RequestMapping("/deleteRole")
    public int deleteRole(RoleInfo roleInfo){
        return roleService.deleteRole(roleInfo);
    }

    @RequestMapping("/deleteReallyRole")
    public int deleteReRole(RoleInfo roleInfo){
        return roleService.deleteReallyRole(roleInfo);
    }
}