package com.speily.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Auther: SPL
 * @Date: 2019-08-27 14:31
 * @Description: - 登录控制器
 */
@Controller
public class LoginController {


    /**
     * 跳转登录页
     * @return
     */
    @GetMapping(value = {"/","/login","login.html"})
    public String loginPage(){
        return "login";
    }


    /**
     * 跳转登录页
     * @return
     */
    @PostMapping(value = {"/","/login","login.html"})
    public String login(){
        return "login";
    }



}
