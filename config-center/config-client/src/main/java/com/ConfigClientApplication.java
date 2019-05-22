package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author{作者}
 * @Date{更新日期}2019/5/21-10:39
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication {

            public static void main(String[] args)
            {
                SpringApplication.run(ConfigClientApplication.class,args);
            }
}
