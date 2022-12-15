package com.example.configurationproperties.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.configurationproperties.cong.MailConfigKeys;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/conf")
@Log4j2
public class RestControllerTest {

    private MailConfigKeys mailConfigKeys;

    RestControllerTest(MailConfigKeys mailConfigKeys){
        this.mailConfigKeys = mailConfigKeys;
    }
    
    @GetMapping("/")
    public String checkService(){
        return "Service Up!";
    }
    @GetMapping("/mail")
    public String getConfigKeys(){
        log.info(this.mailConfigKeys);
        return "Check Console";
    }
}
