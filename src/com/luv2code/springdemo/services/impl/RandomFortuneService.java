package com.luv2code.springdemo.services.impl;

import com.luv2code.springdemo.services.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    //create a random number generator
    private Random randomNumberGenerator = new Random();

    @Override
    public String getFortune() {
        //pick a random string from the array
        int index = randomNumberGenerator.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
