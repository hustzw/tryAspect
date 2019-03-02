package com.example.demo.aop;

import org.springframework.stereotype.Component;

/**
 * @Author: Pingfan
 * @Date: 2019-03-02
 */
@Component
public class DefaultUsageTracked implements UsageTracked {
    @Override
    public void increase() {
        System.out.println("DefaultUsageTracked increase");
    }
}
