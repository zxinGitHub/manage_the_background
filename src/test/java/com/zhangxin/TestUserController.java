package com.zhangxin;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.zhangxin.model.entity.User;
import com.zhangxin.service.IUserService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by zhangxin on 2017/11/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserController{

    private static final Logger logger = LoggerFactory.getLogger(TestUserController.class);

    @Autowired
    private IUserService userService;

    @Test
    public void findUserList(){
        PageBounds pageBounds = new PageBounds();
        pageBounds.setLimit(10);
        PageList<User> users = userService.findUserList(pageBounds);
        System.out.println("users.size():    "+users.size());
    }

}
