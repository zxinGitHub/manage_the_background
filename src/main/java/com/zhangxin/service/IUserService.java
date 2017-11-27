package com.zhangxin.service;


import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.zhangxin.model.entity.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by zhangxin on 2017/11/23.
 */
public interface IUserService {

    List<User> findUserList(RowBounds pageBounds);

}
