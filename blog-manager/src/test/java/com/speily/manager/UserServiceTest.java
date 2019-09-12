package com.speily.manager;

import com.speily.entity.User;
import com.speily.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: SPL
 * @Date: 2019-09-11 10:05
 * @Description: -
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void test01(){
        User user = userService.selectById(1);
        System.out.println(user.getName());
    }


}
