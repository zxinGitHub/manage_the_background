package com.zhangxin.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "jk_order_item")
public class OrderItem implements Serializable {
    @Id
    private Integer id;

    /**
     * 所属订单ID
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 订单编号
     */
    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 商品扩展ID
     */
    @Column(name = "goods_ext_id")
    private Integer goodsExtId;

    /**
     * 销售价
     */
    @Column(name = "sale_price")
    private BigDecimal salePrice;

    /**
     * 销售数量
     */
    @Column(name = "sale_num")
    private Integer saleNum;

    /**
     * 创建人
     */
    @Column(name = "create_person")
    private String createPerson;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取所属订单ID
     *
     * @return order_id - 所属订单ID
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置所属订单ID
     *
     * @param orderId 所属订单ID
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单编号
     *
     * @return order_no - 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号
     *
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return goods_id
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * @param goodsId
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取商品扩展ID
     *
     * @return goods_ext_id - 商品扩展ID
     */
    public Integer getGoodsExtId() {
        return goodsExtId;
    }

    /**
     * 设置商品扩展ID
     *
     * @param goodsExtId 商品扩展ID
     */
    public void setGoodsExtId(Integer goodsExtId) {
        this.goodsExtId = goodsExtId;
    }

    /**
     * 获取销售价
     *
     * @return sale_price - 销售价
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * 设置销售价
     *
     * @param salePrice 销售价
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * 获取销售数量
     *
     * @return sale_num - 销售数量
     */
    public Integer getSaleNum() {
        return saleNum;
    }

    /**
     * 设置销售数量
     *
     * @param saleNum 销售数量
     */
    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
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
        OrderItem other = (OrderItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsExtId() == null ? other.getGoodsExtId() == null : this.getGoodsExtId().equals(other.getGoodsExtId()))
            && (this.getSalePrice() == null ? other.getSalePrice() == null : this.getSalePrice().equals(other.getSalePrice()))
            && (this.getSaleNum() == null ? other.getSaleNum() == null : this.getSaleNum().equals(other.getSaleNum()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdatePerson() == null ? other.getUpdatePerson() == null : this.getUpdatePerson().equals(other.getUpdatePerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsExtId() == null) ? 0 : getGoodsExtId().hashCode());
        result = prime * result + ((getSalePrice() == null) ? 0 : getSalePrice().hashCode());
        result = prime * result + ((getSaleNum() == null) ? 0 : getSaleNum().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdatePerson() == null) ? 0 : getUpdatePerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsExtId=").append(goodsExtId);
        sb.append(", salePrice=").append(salePrice);
        sb.append(", saleNum=").append(saleNum);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append("]");
        return sb.toString();
    }
}