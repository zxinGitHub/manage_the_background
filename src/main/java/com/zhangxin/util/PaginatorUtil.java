package com.zhangxin.util;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.zhangxin.model.bean.PageBean;

/**
 * Created by zhangxin on 2017/11/23.
 */
public class PaginatorUtil {

    public static PageBounds getPageBounds(PageBean pageBean){
        int page = 1;
        int limit = 10;
        boolean containsTotalCount = true;

        if(pageBean != null){
            page = pageBean.getPage();
        }
        if(pageBean.getLimit() != null){
            limit = pageBean.getLimit();
        }
        if(pageBean.getContainsTotalCount() != null){
            containsTotalCount = pageBean.getContainsTotalCount();
        }

        return new PageBounds(page, limit, containsTotalCount);
    }


}
