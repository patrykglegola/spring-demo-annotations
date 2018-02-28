package com.luv2code.springdemo.coaches.impl;

import com.luv2code.springdemo.coaches.Coach;
import com.luv2code.springdemo.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("propertiesFileFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Train passing the ball for 30 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
