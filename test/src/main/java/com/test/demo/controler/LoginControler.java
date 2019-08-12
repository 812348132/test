package com.test.demo.controler;


import com.test.demo.service.HelloService;
import com.test.demo.target.MyFirstAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginControler {

    @Autowired
    private HelloService helloService;

    @MyFirstAnnotation("吃饭")
    @RequestMapping(value = "/login")
    public String login(){
        System.out.println("吃饭");
        return "123";
    }




}
