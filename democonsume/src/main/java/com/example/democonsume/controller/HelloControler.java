package com.example.democonsume.controller;


import com.example.democonsume.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/he")
    public String hi(@RequestParam String name)
    {
        return helloService.hiService(name);
    }

}
