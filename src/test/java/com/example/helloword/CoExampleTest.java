package com.example.helloword;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:CoExampleTest
 * Author:huly
 * Date:2020/10/9  16:11
 * Description:${DESCRIPTION}
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CoExampleTest {
    @Autowired
    private CoExample coExample;

    @Test
    public void getName(){
        System.out.println(coExample.getName());
    }

    @Test
    public void getAge(){
        System.out.println(coExample.getAge());
    }

    @Test
    public void getAddress(){
        System.out.println(coExample.getAddress());
    }
}
