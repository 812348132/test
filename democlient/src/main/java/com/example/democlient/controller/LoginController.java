package com.example.democlient.controller;

import com.example.democlient.pojo.User;
import com.example.democlient.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private LoginService loginService;

    @RequestMapping("/hi")
    public String home(@RequestParam String name){

        User user = loginService.getUser(Long.valueOf(1));

        return "hi " + user.getName() + ",age:" + user.getAge();

    }
}
