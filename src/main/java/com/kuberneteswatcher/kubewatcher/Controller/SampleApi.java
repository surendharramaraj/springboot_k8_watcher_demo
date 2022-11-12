package com.kuberneteswatcher.kubewatcher.Controller;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@RequestMapping("/")
// @RefreshScope
public class SampleApi {

    @Autowired
    private MyConfig config;
    
    @GetMapping
    public String getMessage(){
        return config.getMessage();
    }
}
