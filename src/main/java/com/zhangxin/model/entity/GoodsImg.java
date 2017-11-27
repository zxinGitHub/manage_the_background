package com.zhangxin.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "jk_goods_img")
public class GoodsImg implements Serializable {
    @Id
    private Integer id;

    /**
     * 商品ID
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 图片名字
     */
    @Column(name = "img_name")
    private String imgName;

    /**
     * 图片url
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 重定向url
     */
    @Column(name = "redirct_url")
    private String redirctUrl;

    /**
     * 0:无效，1：有效
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
     * 获取商品ID
     *
     * @return goods_id - 商品ID
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品ID
     *
     * @param goodsId 商品ID
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取图片名字
     *
     * @return img_name - 图片名字
     */
    public String getImgName() {
        return imgName;
    }

    /**
     * 设置图片名字
     *
     * @param imgName 图片名字
     */
    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    /**
     * 获取图片url
     *
     * @return img_url - 图片url
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置图片url
     *
     * @param imgUrl 图片url
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 获取重定向url
     *
     * @return redirct_url - 重定向url
     */
    public String getRedirctUrl() {
        return redirctUrl;
    }

    /**
     * 设置重定向url
     *
     * @param redirctUrl 重定向url
     */
    public void setRedirctUrl(String redirctUrl) {
        this.redirctUrl = redirctUrl;
    }

    /**
     * 获取0:无效，1：有效
     *
     * @return status - 0:无效，1：有效
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0:无效，1：有效
     *
     * @param status 0:无效，1：有效
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
        GoodsImg other = (GoodsImg) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getImgName() == null ? other.getImgName() == null : this.getImgName().equals(other.getImgName()))
            && (this.getImgUrl() == null ? other.getImgUrl() == null : this.getImgUrl().equals(other.getImgUrl()))
            && (this.getRedirctUrl() == null ? other.getRedirctUrl() == null : this.getRedirctUrl().equals(other.getRedirctUrl()))
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
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getImgName() == null) ? 0 : getImgName().hashCode());
        result = prime * result + ((getImgUrl() == null) ? 0 : getImgUrl().hashCode());
        result = prime * result + ((getRedirctUrl() == null) ? 0 : getRedirctUrl().hashCode());
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
        sb.append(", goodsId=").append(goodsId);
        sb.append(", imgName=").append(imgName);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", redirctUrl=").append(redirctUrl);
        sb.append(", status=").append(status);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}