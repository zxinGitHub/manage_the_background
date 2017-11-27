package com.zhangxin.mapper;

import com.zhangxin.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends CustomMapper<User> {
}