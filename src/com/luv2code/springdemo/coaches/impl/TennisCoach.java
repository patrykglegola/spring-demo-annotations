package com.luv2code.springdemo.coaches.impl;

import com.luv2code.springdemo.coaches.Coach;
import com.luv2code.springdemo.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    //@Qualifier("happyFortuneService")
    //@Qualifier("RESTFortuneService")
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // define init method
    @PostConstruct
    public void doStartupStuff() {
        System.out.println(">> TennisCoach: inside of doStartupStuff()");

    }

    //define my destroy method
    @PreDestroy
    public void doCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doCleanupStuff()");

    }

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

/*    // define a setter method
    @Autowired
    public void changedNamOfFortuneServiceSetter(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside changedNamOfFortuneServiceSetter() method");
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
