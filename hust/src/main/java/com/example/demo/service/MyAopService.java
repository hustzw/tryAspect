package com.example.demo.service;

import org.springframework.stereotype.Component;

/**
 * @Author: Pingfan
 * @Date: 2019-03-01
 */
@Component
public class MyAopService {

    public String print(String s) {
        System.out.println(s);
        return s + " already";
    }

    public String say(String s) {
        throw new RuntimeException();
    }

    public String sayHello(String s) {
        return s + "end ";
    }

    public String greet(String s) {
        return s + "end ";
    }
}
