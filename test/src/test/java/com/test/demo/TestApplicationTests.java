package com.test.demo;

import com.test.demo.controler.LoginControler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Autowired
    private LoginControler loginControler;

    @Test
    public void contextLoads() {
        loginControler.login();
    }

    @Test
    public void test1(){

        Runnable thread = new Runnable() {
            @Override
            public void run() {
                System.out.println("12312");
            }
        };

        thread.run();
    }





}
