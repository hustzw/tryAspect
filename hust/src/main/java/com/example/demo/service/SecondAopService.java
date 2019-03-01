package com.example.demo.service;

import com.example.demo.aop.AuthAble;
import org.springframework.stereotype.Service;

/**
 * @Author: Pingfan
 * @Date: 2019-03-01
 */
@Service
public class SecondAopService {

    @AuthAble(type = "ss")
    public String msy(String s) {
        return s;
    }

    public String second(String s) {
        return s;
    }
}
