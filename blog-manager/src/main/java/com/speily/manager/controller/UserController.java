package com.speily.manager.controller;


import com.speily.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import com.speily.commons.BaseController;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author Speily
 * @since 2019-08-30
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {


    @Autowired
    private UserService userService;


    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        return userService.selectById(1);
    }

}

