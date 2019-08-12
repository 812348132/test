package com.example.democonsume.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiErr")
    public String hiService(String name){

        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }


    public String hiErr(String name){
        return "hey " +
                name + ", there is some problem with hi page";
    };
}
