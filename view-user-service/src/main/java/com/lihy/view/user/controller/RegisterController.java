package com.lihy.view.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihy
 * @date 2018/04/17
 */
@RefreshScope
@RestController
@RequestMapping("/register")
public class RegisterController {
    @Value("${profile}")
    private String profile;

    @GetMapping("/getName")
    public String getName() {
        return this.profile;
    }
}
