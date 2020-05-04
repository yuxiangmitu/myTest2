package com.neusoft.springboot_test.service;

import com.neusoft.springboot_test.entity.RoleInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    int insertRole(RoleInfo roleInfo);
    List listRoleInfo(RoleInfo roleInfo);
    int updateRole(RoleInfo roleInfo);
    int deleteRole(RoleInfo roleInfo);
    int deleteReallyRole(RoleInfo roleInfo);
}
