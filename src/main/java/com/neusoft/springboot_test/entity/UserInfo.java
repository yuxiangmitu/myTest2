package com.neusoft.springboot_test.entity;

import java.util.Date;

/**
 * @Author: cxl
 * @Date: 2020/5/2 17:30
 */
public class UserInfo {

    /**
     * @Description: 数据id
     * @author: cxl
     * @date: 2020/5/2
     */
    private String id;

    /**
     * @Description: 用户账号
     * @author: cxl
     * @date: 2020/5/2
     */
    private String userAcct;

    /**
     * @Description: 用户名称
     * @author: cxl
     * @date: 2020/5/2
     */
    private String userName;

    /**
     * @Description: 用户性别
     * @author: cxl
     * @date: 2020/5/2
     */
    private String sex;

    /**
     * @Description: 用户电话
     * @author: cxl
     * @date: 2020/5/2
     */
    private String phone;

    /**
     * @Description: 用户邮箱
     * @author: cxl
     * @date: 2020/5/2
     */
    private String email;

    /**
     * @Description: 用户身份证
     * @author: cxl
     * @date: 2020/5/2
     */
    private String idCard;

    /**
     * @Description: 作废标记
     * @author: cxl
     * @date: 2020/5/2
     */
    private Integer isDeleted;

    /**
     * @Description: 序号
     * @author: cxl
     * @date: 2020/5/2
     */
    private Integer sortNo;

    /**
     * @Description: 创建日期
     * @author: cxl
     * @date: 2020/5/2
     */
    private Date gmtCreate;

    /**
     * @Description: 创建者
     * @author: cxl
     * @date: 2020/5/2
     */
    private String createBy;

    /**
     * @Description: 调整日期
     * @author: cxl
     * @date: 5/2
     */
    private Date gmtModified;

    /**
     * @Description: 最后一次调整日期
     * @author: cxl
     * @date: 2020/5/2
     */
    private String lastModifiedBy;

    /**
     * @Description: 版本号
     * @author: cxl
     * @date: 2020/5/2
     */
    private Integer version;

    /**
     * @Description: 用户密码
     * @author: cxl
     * @date: 2020/5/2
     */
    private String userPwd;

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserAcct() {
        return userAcct;
    }

    public void setUserAcct(String userAcct) {
        this.userAcct = userAcct;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", userAcct='" + userAcct + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", idCard='" + idCard + '\'' +
                ", isDeleted=" + isDeleted +
                ", sortNo=" + sortNo +
                ", gmtCreate=" + gmtCreate +
                ", createBy='" + createBy + '\'' +
                ", gmtModified=" + gmtModified +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", version=" + version +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}
