package com.neusoft.springboot_test.entity;

import java.util.Date;

/**
 * @Author: cxl
 * @Date: 2020/5/3 22:36
 */
public class RoleInfo {

    /**
     * @Description: 角色id
     * @author: cxl
     * @date: 2020/5/3
     */
    private String roleId;

    /**
     * @Description: 角色名称
     * @author: cxl
     * @date: 2020/5/3
     */
    private String roleName;

    /**
     * @Description: 作废标记
     * @author: cxl
     * @date: 2020/5/3
     */
    private Integer isDeleted;

    /**
     * @Description: 序号
     * @author: cxl
     * @date: 2020/5/3
     */
    private Integer sortNo;

    /**
     * @Description: 创建日期
     * @author: cxl
     * @date: 2020/5/3
     */
    private Date gmtCreate;

    /**
     * @Description: 创建者
     * @author: cxl
     * @date: 2020/5/3
     */
    private String createBy;

    /**
     * @Description: 调整日期
     * @author: cxl
     * @date: 5/3
     */
    private Date gmtModified;

    /**
     * @Description: 最后一次调整日期
     * @author: cxl
     * @date: 2020/5/3
     */
    private String lastModifiedBy;

    /**
     * @Description: 版本号
     * @author: cxl
     * @date: 2020/5/3
     */
    private Integer version;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", isDeleted=" + isDeleted +
                ", sortNo=" + sortNo +
                ", gmtCreate=" + gmtCreate +
                ", createBy='" + createBy + '\'' +
                ", gmtModified=" + gmtModified +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", version=" + version +
                '}';
    }
}