package com.swjtu.scalelab.day0921springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Dog {
/*    @Value("豆豆")*/
    private String name;
/*    @Value("18")*/
    private int age;
}
