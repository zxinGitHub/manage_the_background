package com.zhangxin.mapper;

import com.zhangxin.model.entity.User;
import com.zhangxin.model.entity.UserCriteria;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface UserMapper extends CustomMapper<User> {
    long countByExample(UserCriteria example);

    int deleteByExample(UserCriteria example);

    List<User> selectByExampleWithRowbounds(UserCriteria example, RowBounds rowBounds);

    List<User> selectByExample(UserCriteria example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserCriteria example);

    int updateByExample(@Param("record") User record, @Param("example") UserCriteria example);
}