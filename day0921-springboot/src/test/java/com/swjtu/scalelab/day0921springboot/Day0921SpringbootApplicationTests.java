package com.swjtu.scalelab.day0921springboot;

import com.swjtu.scalelab.day0921springboot.pojo.Dog;
import com.swjtu.scalelab.day0921springboot.pojo.Person;
import com.swjtu.scalelab.day0921springboot.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Day0921SpringbootApplicationTests {

    @Autowired
    private Dog dog;

    @Autowired
    private Person person;

    @Autowired
    private User user;
    @Test
    void contextLoads() {
    }


    @Test
    void test(){
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(person);
        System.out.println(user);
    }

}
