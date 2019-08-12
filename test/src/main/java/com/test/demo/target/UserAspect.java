package com.test.demo.target;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspect {

    @Pointcut("@annotation(UserAnnotation)")
    public void he(){

    }

    @Before("he()")
    public void hh(){
        System.out.println(123);
    }
}
