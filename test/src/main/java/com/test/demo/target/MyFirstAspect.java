package com.test.demo.target;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class MyFirstAspect {


    @Pointcut("@annotation(MyFirstAnnotation)")
    public void annotationPointcut() {
    }

    @Before("annotationPointcut()")
    public void before(){
        System.out.println("开始");
    }

    @After("annotationPointcut()")
    public void after(JoinPoint joinPoint){

        MethodSignature methodSignature =  (MethodSignature) joinPoint.getSignature();
        Method method =  methodSignature.getMethod();
        MyFirstAnnotation myFirstAnnotation = method.getAnnotation(MyFirstAnnotation.class);
        System.out.println("准备"  + myFirstAnnotation.value());

    }
}
