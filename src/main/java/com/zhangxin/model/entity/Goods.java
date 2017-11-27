package com.zhangxin.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "jk_goods")
public class Goods implements Serializable {
    @Id
    private Integer id;

    /**
     * 商品title
     */
    private String title;

    /**
     * 商品名
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 商品缩略图URL
     */
    private String thumb;

    /**
     * 市场价
     */
    @Column(name = "market_price")
    private BigDecimal marketPrice;

    /**
     * 销售价
     */
    @Column(name = "sale_price")
    private BigDecimal salePrice;

    /**
     * 平均每期金额
     */
    @Column(name = "avg_price")
    private BigDecimal avgPrice;

    /**
     * 广告语
     */
    @Column(name = "advertise_title")
    private String advertiseTitle;

    /**
     * 商品信息
     */
    @Column(name = "goods_info")
    private String goodsInfo;

    /**
     * 售后说明
     */
    @Column(name = "sale_service")
    private String saleService;

    /**
     * 须知
     */
    private String notice;

    /**
     * 0:下架，1：上架
     */
    private Byte status;

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
     * 获取商品title
     *
     * @return title - 商品title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置商品title
     *
     * @param title 商品title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取商品名
     *
     * @return goods_name - 商品名
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置商品名
     *
     * @param goodsName 商品名
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * 获取商品缩略图URL
     *
     * @return thumb - 商品缩略图URL
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * 设置商品缩略图URL
     *
     * @param thumb 商品缩略图URL
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     * 获取市场价
     *
     * @return market_price - 市场价
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * 设置市场价
     *
     * @param marketPrice 市场价
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
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
     * 获取平均每期金额
     *
     * @return avg_price - 平均每期金额
     */
    public BigDecimal getAvgPrice() {
        return avgPrice;
    }

    /**
     * 设置平均每期金额
     *
     * @param avgPrice 平均每期金额
     */
    public void setAvgPrice(BigDecimal avgPrice) {
        this.avgPrice = avgPrice;
    }

    /**
     * 获取广告语
     *
     * @return advertise_title - 广告语
     */
    public String getAdvertiseTitle() {
        return advertiseTitle;
    }

    /**
     * 设置广告语
     *
     * @param advertiseTitle 广告语
     */
    public void setAdvertiseTitle(String advertiseTitle) {
        this.advertiseTitle = advertiseTitle;
    }

    /**
     * 获取商品信息
     *
     * @return goods_info - 商品信息
     */
    public String getGoodsInfo() {
        return goodsInfo;
    }

    /**
     * 设置商品信息
     *
     * @param goodsInfo 商品信息
     */
    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    /**
     * 获取售后说明
     *
     * @return sale_service - 售后说明
     */
    public String getSaleService() {
        return saleService;
    }

    /**
     * 设置售后说明
     *
     * @param saleService 售后说明
     */
    public void setSaleService(String saleService) {
        this.saleService = saleService;
    }

    /**
     * 获取须知
     *
     * @return notice - 须知
     */
    public String getNotice() {
        return notice;
    }

    /**
     * 设置须知
     *
     * @param notice 须知
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }

    /**
     * 获取0:下架，1：上架
     *
     * @return status - 0:下架，1：上架
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0:下架，1：上架
     *
     * @param status 0:下架，1：上架
     */
    public void setStatus(Byte status) {
        this.status = status;
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
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getThumb() == null ? other.getThumb() == null : this.getThumb().equals(other.getThumb()))
            && (this.getMarketPrice() == null ? other.getMarketPrice() == null : this.getMarketPrice().equals(other.getMarketPrice()))
            && (this.getSalePrice() == null ? other.getSalePrice() == null : this.getSalePrice().equals(other.getSalePrice()))
            && (this.getAvgPrice() == null ? other.getAvgPrice() == null : this.getAvgPrice().equals(other.getAvgPrice()))
            && (this.getAdvertiseTitle() == null ? other.getAdvertiseTitle() == null : this.getAdvertiseTitle().equals(other.getAdvertiseTitle()))
            && (this.getGoodsInfo() == null ? other.getGoodsInfo() == null : this.getGoodsInfo().equals(other.getGoodsInfo()))
            && (this.getSaleService() == null ? other.getSaleService() == null : this.getSaleService().equals(other.getSaleService()))
            && (this.getNotice() == null ? other.getNotice() == null : this.getNotice().equals(other.getNotice()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
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
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getThumb() == null) ? 0 : getThumb().hashCode());
        result = prime * result + ((getMarketPrice() == null) ? 0 : getMarketPrice().hashCode());
        result = prime * result + ((getSalePrice() == null) ? 0 : getSalePrice().hashCode());
        result = prime * result + ((getAvgPrice() == null) ? 0 : getAvgPrice().hashCode());
        result = prime * result + ((getAdvertiseTitle() == null) ? 0 : getAdvertiseTitle().hashCode());
        result = prime * result + ((getGoodsInfo() == null) ? 0 : getGoodsInfo().hashCode());
        result = prime * result + ((getSaleService() == null) ? 0 : getSaleService().hashCode());
        result = prime * result + ((getNotice() == null) ? 0 : getNotice().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", title=").append(title);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", thumb=").append(thumb);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", salePrice=").append(salePrice);
        sb.append(", avgPrice=").append(avgPrice);
        sb.append(", advertiseTitle=").append(advertiseTitle);
        sb.append(", goodsInfo=").append(goodsInfo);
        sb.append(", saleService=").append(saleService);
        sb.append(", notice=").append(notice);
        sb.append(", status=").append(status);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}