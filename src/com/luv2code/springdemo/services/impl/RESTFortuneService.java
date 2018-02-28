package com.luv2code.springdemo.services.impl;

import com.luv2code.springdemo.services.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "rest fortune";
    }
}
