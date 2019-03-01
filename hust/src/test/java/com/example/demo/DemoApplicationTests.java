package com.example.demo;

import com.example.demo.service.MyAopService;
import com.example.demo.service.SecondAopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private MyAopService myAopService;

    @Test
    public void contextLoads() {
        myAopService.print("hello");
    }

    @Test
    public void contextLoads2() {
        myAopService.say("hello");
    }

    @Test
    public void contextLoads3() {
        myAopService.sayHello("hello");
    }

    @Test
    public void contextLoads4() {
        myAopService.greet("hello");
    }


    @Autowired
    private SecondAopService secondAopService;

    @Test
    public void shoulss() {
        secondAopService.msy("heko");
    }

    @Test
    public void shooslww() {
        secondAopService.second("heko");
    }


}
