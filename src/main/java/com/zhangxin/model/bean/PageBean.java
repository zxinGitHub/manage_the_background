package com.zhangxin.model.bean;

/**
 * Created by zhangxin on 2017/11/23.
 */
public class PageBean {

    Integer page;

    Integer limit;

    Boolean containsTotalCount;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Boolean getContainsTotalCount() {
        return containsTotalCount;
    }

    public void setContainsTotalCount(Boolean containsTotalCount) {
        this.containsTotalCount = containsTotalCount;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "page=" + page +
                ", limit=" + limit +
                ", containsTotalCount=" + containsTotalCount +
                '}';
    }
}
