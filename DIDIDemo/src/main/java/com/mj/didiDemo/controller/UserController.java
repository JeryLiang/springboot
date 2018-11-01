package com.mj.didiDemo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPObject;
import com.mj.didiDemo.domain.User;
import com.mj.didiDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhoujian123@hotmail.com 2018/5/18 17:34
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUserById",method = RequestMethod.GET)
    public User getUserById(@RequestParam(value = "id",required = true) long id){

        return userService.getUserById(id);
    }

    @RequestMapping(value = "getUserByIdPost",method = RequestMethod.POST)
    public void  getUserByIdPost(@RequestBody User user ,HttpServletResponse response ) throws IOException {
        User user1;
        user1= userService.getUserById(user.getId());
//        String s = JSON.toJSONString(user1);
        Object json = JSON.toJSON(user1);
        response.getWriter().print(json);
    }
}
