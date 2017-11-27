package com.zhangxin.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "jk_order")
public class Order implements Serializable {
    @Id
    private Integer id;

    /**
     * uid
     */
    private Integer uid;

    /**
     * 用户姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 订单编号: 生成规则：TRJ+YYYYMMDDHHmmss+随机数＋商品ID＋产品ID
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 订单金额
     */
    private BigDecimal amount;

    /**
     * 0:已创建  1:审核中 2: 已通过 3: 审核失败 
     */
    private Byte status;

    /**
     * 用户银行卡id 主键
     */
    @Column(name = "user_bank_card_id")
    private Integer userBankCardId;

    /**
     * 送货地址Id (jk_deliver_address 主键)
     */
    @Column(name = "deliver_id")
    private Integer deliverId;

    /**
     * 是否开具发票： 0 否 1 是
     */
    @Column(name = "is_invoice")
    private Byte isInvoice;

    /**
     * 创建人
     */
    @Column(name = "create_person")
    private String createPerson;

    /**
     * 更新人
     */
    @Column(name = "update_person")
    private String updatePerson;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取uid
     *
     * @return uid - uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置uid
     *
     * @param uid uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取用户姓名
     *
     * @return user_name - 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户姓名
     *
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取订单编号: 生成规则：TRJ+YYYYMMDDHHmmss+随机数＋商品ID＋产品ID
     *
     * @return order_no - 订单编号: 生成规则：TRJ+YYYYMMDDHHmmss+随机数＋商品ID＋产品ID
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号: 生成规则：TRJ+YYYYMMDDHHmmss+随机数＋商品ID＋产品ID
     *
     * @param orderNo 订单编号: 生成规则：TRJ+YYYYMMDDHHmmss+随机数＋商品ID＋产品ID
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取订单金额
     *
     * @return amount - 订单金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置订单金额
     *
     * @param amount 订单金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取0:已创建  1:审核中 2: 已通过 3: 审核失败 
     *
     * @return status - 0:已创建  1:审核中 2: 已通过 3: 审核失败 
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0:已创建  1:审核中 2: 已通过 3: 审核失败 
     *
     * @param status 0:已创建  1:审核中 2: 已通过 3: 审核失败 
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取用户银行卡id 主键
     *
     * @return user_bank_card_id - 用户银行卡id 主键
     */
    public Integer getUserBankCardId() {
        return userBankCardId;
    }

    /**
     * 设置用户银行卡id 主键
     *
     * @param userBankCardId 用户银行卡id 主键
     */
    public void setUserBankCardId(Integer userBankCardId) {
        this.userBankCardId = userBankCardId;
    }

    /**
     * 获取送货地址Id (jk_deliver_address 主键)
     *
     * @return deliver_id - 送货地址Id (jk_deliver_address 主键)
     */
    public Integer getDeliverId() {
        return deliverId;
    }

    /**
     * 设置送货地址Id (jk_deliver_address 主键)
     *
     * @param deliverId 送货地址Id (jk_deliver_address 主键)
     */
    public void setDeliverId(Integer deliverId) {
        this.deliverId = deliverId;
    }

    /**
     * 获取是否开具发票： 0 否 1 是
     *
     * @return is_invoice - 是否开具发票： 0 否 1 是
     */
    public Byte getIsInvoice() {
        return isInvoice;
    }

    /**
     * 设置是否开具发票： 0 否 1 是
     *
     * @param isInvoice 是否开具发票： 0 否 1 是
     */
    public void setIsInvoice(Byte isInvoice) {
        this.isInvoice = isInvoice;
    }

    /**
     * 获取创建人
     *
     * @return create_person - 创建人
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * 设置创建人
     *
     * @param createPerson 创建人
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * 获取更新人
     *
     * @return update_person - 更新人
     */
    public String getUpdatePerson() {
        return updatePerson;
    }

    /**
     * 设置更新人
     *
     * @param updatePerson 更新人
     */
    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUserBankCardId() == null ? other.getUserBankCardId() == null : this.getUserBankCardId().equals(other.getUserBankCardId()))
            && (this.getDeliverId() == null ? other.getDeliverId() == null : this.getDeliverId().equals(other.getDeliverId()))
            && (this.getIsInvoice() == null ? other.getIsInvoice() == null : this.getIsInvoice().equals(other.getIsInvoice()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getUpdatePerson() == null ? other.getUpdatePerson() == null : this.getUpdatePerson().equals(other.getUpdatePerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUserBankCardId() == null) ? 0 : getUserBankCardId().hashCode());
        result = prime * result + ((getDeliverId() == null) ? 0 : getDeliverId().hashCode());
        result = prime * result + ((getIsInvoice() == null) ? 0 : getIsInvoice().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getUpdatePerson() == null) ? 0 : getUpdatePerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", userName=").append(userName);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", amount=").append(amount);
        sb.append(", status=").append(status);
        sb.append(", userBankCardId=").append(userBankCardId);
        sb.append(", deliverId=").append(deliverId);
        sb.append(", isInvoice=").append(isInvoice);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}