package com.luv2code.springdemo.config;

import com.luv2code.springdemo.coaches.Coach;
import com.luv2code.springdemo.coaches.impl.SwimCoach;
import com.luv2code.springdemo.services.FortuneService;
import com.luv2code.springdemo.services.impl.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
public class SportConfig {

    // define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for swim couch and inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}

