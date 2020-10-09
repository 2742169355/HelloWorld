package com.example.helloword;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * FileName:GetPersonInfoProperties
 * Author:huly
 * Date:2020/10/9  15:40
 * Description:${DESCRIPTION}
 */
@Component
@ConfigurationProperties(prefix = "personinfo")
public class GetPersonInfoProperties {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
