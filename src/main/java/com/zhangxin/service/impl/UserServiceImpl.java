package com.zhangxin.service.impl;

import com.zhangxin.mapper.UserMapper;
import com.zhangxin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by zhangxin on 2017/11/23.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;



}
