package com.example.helloword;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:propertTest
 * Author:huly
 * Date:2020/10/8  15:42
 * Description:${DESCRIPTION}
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class propertTest {
    @Autowired
    private GetPersonInfoProperties getPersonInfoProperties;

    @Value("${age}")
    private int age;

    @Value("${name}")
    private String name;

    @Test
    public void getAge() {
        System.out.println(age);
    }

    @Test
    public void getName() {
        System.out.println(name);
    }

    @Test
    public void getPersonProperties(){
        System.out.println(getPersonInfoProperties.getName()+getPersonInfoProperties.getAge());
    }

}
