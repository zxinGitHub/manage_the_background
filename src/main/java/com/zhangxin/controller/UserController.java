package com.zhangxin.controller;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.zhangxin.model.entity.User;
import com.zhangxin.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangxin on 2017/11/23.
 */
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private IUserService userService;

    public void findUserList(){
        PageBounds pageBounds = new PageBounds();
        List<User> users = userService.findUserList(pageBounds);
        System.out.println("users.size():    "+users.size());
    }


}
