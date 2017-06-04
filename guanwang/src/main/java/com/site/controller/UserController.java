package com.site.controller;

import com.site.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by yuch on 2017/6/4.
 */
@Controller
@RequestMapping
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value="user/userDetail")
    public String findUser(Map<String,Object> map){
        map.put("user",this.userService.find(200033L));
        return "user/user";
    }

    @RequestMapping(value="user/userTest")
    public String userTest(Map<String,Object> map){
        map.put("user","aaaa");
        return "user/userTest";
    }
}
