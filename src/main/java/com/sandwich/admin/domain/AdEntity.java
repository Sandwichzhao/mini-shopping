package com.sandwich.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

/**
 * @description ad
 * @date 2021-07-01
 */
@Entity
@Table(name="ad")
public class AdEntity {

    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @Column(name="link_type")
    private int linkType;

    @Column(name="link")
    private String link;

    @Column(name="goods_id")
    private long goodsId;

    @Column(name="image_url")
    private String imageUrl;

    @Column(name="end_time")
    private long endTime;

    @Column(name="enabled")
    private int enabled;

    @Column(name="sort_order")
    private int sortOrder;

    @Column(name="is_delete")
    private int isDelete;

    public AdEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLinkType() {
        return linkType;
    }

    public void setLinkType(int linkType) {
        this.linkType = linkType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}