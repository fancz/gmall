package com.fancz.gamll.user.controller;

import com.fancz.gamll.user.bean.UmsMember;
import com.fancz.gamll.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author fancz
 * @Title: ${file_name}
 * @date 2020/5/26 14:07
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "FFFFFFFFFFFFFFFFFFF";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        return  userService.getAllUser();
    }

}
