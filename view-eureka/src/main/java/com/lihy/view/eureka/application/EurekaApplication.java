package com.lihy.view.eureka.application;


import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心
 * @author lihy
 * @date 2018/04/16
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        //SpringApplication.run(EurekaApplication.class, args);
        //new SpringApplicationBuilder(EurekaApplication.class).web(WebApplicationType.SERVLET).run(args);
        SpringApplication springApplication = new SpringApplication(EurekaApplication.class);
        springApplication.setBanner((environment, sourceClass, out) -> {
            System.out.println("eeee");
        });
        springApplication.setBannerMode(Banner.Mode.CONSOLE);
        springApplication.run(args);
    }
}
