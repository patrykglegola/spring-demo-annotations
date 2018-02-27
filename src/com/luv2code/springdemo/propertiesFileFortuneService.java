package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class propertiesFileFortuneService implements FortuneService {

    @Value("${fortuneService.fortunes}")
    private String[] data;

    private Random randomNumberGenerator = new Random();


    @Override
    public String getFortune() {
        int index = randomNumberGenerator.nextInt(data.length);
        return data[index];
    }
}
