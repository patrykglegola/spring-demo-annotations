package com.luv2code.springdemo.services.impl;

import com.luv2code.springdemo.services.FortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

//@Component
public class propertiesFileFortuneService implements FortuneService {

    @Value("${fortuneService.fortunes}")
    private String[] data;

    private Random randomNumberGenerator = new Random();

    @PostConstruct
    public void loadFortune() {
        System.out.println(">> propertiesFileFortuneService loadFortune method: " + getFortune());
    }

    @Override
    public String getFortune() {
        int index = randomNumberGenerator.nextInt(data.length);
        return data[index];
    }
}
