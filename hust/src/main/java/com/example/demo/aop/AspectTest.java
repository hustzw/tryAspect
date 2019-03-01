package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: Pingfan
 * @Date: 2019-03-01
 */

@Component
@Aspect
public class AspectTest {

    @AfterReturning(pointcut = "execution(* com.example.demo.service.*.*(..))", returning = "retVal")
    // JoinPoint must be first args
    public void process(JoinPoint joinPoint, Object retVal) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        System.out.println(retVal.toString() + " end");
    }

    @AfterThrowing(pointcut = "execution(* com.example.demo.service.MyAopService.say(..))", throwing = "ex")
    public void doRecoveryActions(JoinPoint joinPoint, Exception ex) {
        // ...
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("exception happen" + methodSignature.getMethod().getName());
    }

    @After("execution(* com.example.demo.service.MyAopService.sayHello(..))")
    public void doRecoveryAction(JoinPoint joinPoint) {
        // ...
        System.out.println("after happen");
    }

    @Before("execution(* com.example.demo.service.MyAopService.greet(..))")
    public void doRecoveryAction3(JoinPoint joinPoint) {
        // ...
        System.out.println("before happen");
    }

    @Around("execution(* com.example.demo.service.*.* (..)) ")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知：在目标方法执行前后都执行");
        Object result = joinPoint.proceed();
        return result;
    }

    @Pointcut(value = "execution(* com.example.demo.service.*.*(..))")
    public void sssst() {
        System.out.println("kkkaaa");
    }

    @Around("@annotation(authAble)")//com.example.demo.aop.AuthAble)(authAble)")
    public Object catTransactionControl(ProceedingJoinPoint joinPoint, AuthAble authAble) throws Throwable {

        System.out.println("catTransactionControl");
        return joinPoint.proceed();
    }
}
