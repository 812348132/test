package com.test.demo.controler;

import com.test.demo.target.UserAnnotation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userControler {


    @RequestMapping(value = "/getUser")
    @UserAnnotation("name")
    public String getUser(){

        return "";
    }
}
