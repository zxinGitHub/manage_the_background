package com.zhangxin.service.impl;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.zhangxin.mapper.UserMapper;
import com.zhangxin.model.entity.User;
import com.zhangxin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;


/**
 * Created by zhangxin on 2017/11/23.
 */
@Service("userService")
public class UserServiceImpl implements IUserService,Serializable {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageList<User> findUserList(PageBounds pageBounds) {
        PageList<User> list = (PageList<User>) userMapper.selectByExampleAndRowBounds(null,pageBounds);
        //PageList<User> list = (PageList<User>)userMapper.selectByExampleWithRowbounds(null,pageBounds);
        return list;
        //return null;
    }
}
