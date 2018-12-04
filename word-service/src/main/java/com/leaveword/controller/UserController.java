package com.leaveword.controller;

import com.leaveword.service.serviceApi.UserService;
import org.fdse.commonservice.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 用户登录
     *
     * @param userName
     * @param userPassword
     * @return
     */
    @PostMapping(value = "/userLogin")
    public Response userLogin(@RequestParam("userName")String userName,
                              @RequestParam("userPassword")String userPassword){
        return userService.userLogin(userName,userPassword);
    }


}
