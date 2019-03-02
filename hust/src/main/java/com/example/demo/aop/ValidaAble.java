package com.example.demo.aop;

/**
 * @Author: Pingfan
 * @Date: 2019-03-01
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ValidaAble {
    String type();
}
