package com.luv2code.springdemo.services.impl;

import com.luv2code.springdemo.services.FortuneService;

public class PracticeFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Practice will make you a master!";
    }
}
