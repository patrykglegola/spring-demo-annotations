package com.luv2code.springdemo.apps;

import com.luv2code.springdemo.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("footballCoach", Coach.class);
        theCoach.getDailyWorkout();
        context.close();
    }
}
