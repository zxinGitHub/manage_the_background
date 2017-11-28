package com.zhangxin.service;


import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.zhangxin.model.entity.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by zhangxin on 2017/11/23.
 */
public interface IUserService {

    PageList<User> findUserList(PageBounds pageBounds);

}
