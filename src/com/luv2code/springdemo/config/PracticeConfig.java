package com.luv2code.springdemo.config;

import com.luv2code.springdemo.coaches.Coach;
import com.luv2code.springdemo.coaches.impl.BasketballCoach;
import com.luv2code.springdemo.services.FortuneService;
import com.luv2code.springdemo.services.impl.PracticeFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeConfig {

    @Bean
    public FortuneService practiceFortuneService() {
        return new PracticeFortuneService();
    }

    @Bean
    public Coach basketballCoach() {
        return new BasketballCoach(practiceFortuneService());
    }
}
