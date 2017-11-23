package com.zhangxin.model.entity;

import javax.persistence.*;

@Table(name = "jk_user")
public class User {
    /**
     * uid
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 名字
     */
    private String name;

    /**
     * 证件号码
     */
    @Column(name = "identity_id")
    private String identityId;

    /**
     * 0:无效,1:有效
     */
    private Byte status;

    /**
     * 获取uid
     *
     * @return id - uid
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置uid
     *
     * @param id uid
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取名字
     *
     * @return name - 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取证件号码
     *
     * @return identity_id - 证件号码
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * 设置证件号码
     *
     * @param identityId 证件号码
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * 获取0:无效,1:有效
     *
     * @return status - 0:无效,1:有效
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0:无效,1:有效
     *
     * @param status 0:无效,1:有效
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIdentityId() == null ? other.getIdentityId() == null : this.getIdentityId().equals(other.getIdentityId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", password=").append(password);
        sb.append(", mobile=").append(mobile);
        sb.append(", name=").append(name);
        sb.append(", identityId=").append(identityId);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}