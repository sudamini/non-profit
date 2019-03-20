package com.sportscontender.loginservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class LoginServiceController {
    //GET
    //URI - login-service
    @GetMapping(path = "/login-service")
    public String loginService(){
        return "Welcome to Sports-Contender";
    }

    @GetMapping(path = "/login-service-bean")
    public LoginServiceBean loginServiceBean(){
        return new LoginServiceBean("Welcome to Sports-Contender");
    }
}
