package com.speily.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.speily.entity.User;
import com.speily.dao.UserMapper;
import com.speily.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Speily
 * @since 2019-08-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

}
