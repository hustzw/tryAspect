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
    @Pointcut("execution(* com.example.demo.service.MyAopService.*(..))")
    private void logMessage() {
        // 此方法无任何执行内容，只会被引用 pointcut。不会被执行
        // Spring的切入点模型使得切入点可以独立于通知（advice）类型进行重用，这就使得针对不同通知使用相同的pointcut成为可能。
    }

    @Pointcut("execution(* com.example.demo.service.MyAopService.say(..))")
    public void logAttachment() {
        System.out.println("logAttachment");
    }

    @Before("logMessage()")
    private void kakak() {
        System.out.println("Pointcuts::kakak");
    }
}
