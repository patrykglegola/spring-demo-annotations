package com.luv2code.springdemo.coaches.impl;

import com.luv2code.springdemo.coaches.Coach;
import com.luv2code.springdemo.services.FortuneService;

public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    public BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Train 3-points throws for 20 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
