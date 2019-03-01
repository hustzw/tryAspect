package com.example.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: Pingfan
 * @Date: 2019-03-01
 */
@Component
@Aspect
public class Pointcuts {
    @Pointcut("execution(* com.example.demo.service.MyAopService.greet(..))")
    public void logMessage() {
        System.out.println("logMessage");
    }

    @Pointcut("execution(* com.example.demo.service.MyAopService.say(..))")
    public void logAttachment() {
        System.out.println("logAttachment");
    }

    @Pointcut("logMessage() || logAttachment()")
    public void logMessage2() {
        System.out.println("logMessage2");
    }

    @Before("execution(* com.example.demo.aop.Pointcuts.logMessage2(..))")
    public void kakak() {
        System.out.println("Pointcuts::kakak");
    }
}
