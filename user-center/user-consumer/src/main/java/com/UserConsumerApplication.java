package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @Author{作者}
 * @Date{更新日期}2019/5/17-17:47
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserConsumerApplication {

    public static  void main(String[] args)
    {
        SpringApplication.run(UserConsumerApplication.class, args);
    }
}
