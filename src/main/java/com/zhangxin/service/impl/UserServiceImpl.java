package com.zhangxin.service.impl;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.zhangxin.mapper.UserMapper;
import com.zhangxin.model.entity.User;
import com.zhangxin.service.IUserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;


/**
 * Created by zhangxin on 2017/11/23.
 */
@Service("userService")
public class UserServiceImpl implements IUserService,Serializable {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserList(RowBounds pageBounds) {
        List<User> list= userMapper.selectByExampleAndRowBounds(null,pageBounds);
        return list;
        //return null;
    }
}
