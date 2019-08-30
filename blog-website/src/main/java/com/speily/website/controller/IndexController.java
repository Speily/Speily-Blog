package com.speily.website.controller;

import com.speily.commons.BaseController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: SPL
 * @Date: 2019-08-27 14:20
 * @Description: -
 */
public class IndexController extends BaseController {

    /**
     * 跳转主页
     * @return
     */
    @GetMapping(value = {"/","/index","index.html"})
    public String index(){
        return "index";
    }

}
