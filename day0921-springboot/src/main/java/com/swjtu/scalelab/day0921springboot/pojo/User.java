package com.swjtu.scalelab.day0921springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

@Component
@PropertySource(value = "classpath:user.properties")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Value("${user.name}")
    private String name;
    @Value("${user.age}")
    private Integer age;
    @Value("${user.sex}")
    private String sex;
}
