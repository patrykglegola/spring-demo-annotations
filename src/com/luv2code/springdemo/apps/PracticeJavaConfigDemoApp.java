package com.luv2code.springdemo.apps;

import com.luv2code.springdemo.coaches.Coach;
import com.luv2code.springdemo.config.PracticeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeJavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PracticeConfig.class);
        Coach coach = context.getBean("basketballCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}
