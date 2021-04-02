package com.cjf.demo.controller;

import com.cjf.demo.domain.User;
import com.cjf.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述 ：用户 Controller
 */
@RestController
@RequestMapping("/student")
public class UserController {

    @Autowired
    private UserService userService;

//
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    @GetMapping("/findById")
    public String findById(@RequestParam Integer id) {

        User user = userService.findById(id);

        return user.toString();
    }

}
