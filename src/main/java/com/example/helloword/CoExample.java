package com.example.helloword;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * FileName:CoExample
 * Author:huly
 * Date:2020/10/9  16:04
 * Description:${DESCRIPTION}
 */
@Data
@Component
@ConfigurationProperties(prefix = "com.example")
public class CoExample {
    private String name;
    private int age;
    private List<String> address;
}
