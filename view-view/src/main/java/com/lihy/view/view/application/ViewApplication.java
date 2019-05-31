package com.lihy.view.view.application;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 这里可以用SpringCloudApplication注解代替SpringBootApplication，
 * 该注解还包括了EnableDiscoveryClient和EnableCircuitBreaker
 * 注解ComponentScan扫描包名下的服务
 * 注解EnableFeignClients指明feign接口定义
 * @author lihy
 * @date 2018/04/16
 */
@SpringCloudApplication
@ComponentScan(basePackages = {"com.lihy.view"})
//@EnableFeignClients(basePackages = "com.lihy.view.api")
@EnableFeignClients(basePackages = "com.lihy.view.view.api")
public class ViewApplication {
    public static void main(String[] args) {
        SpringApplication.run(ViewApplication.class, args);
    }
}
