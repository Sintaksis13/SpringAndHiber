package com.springandhiber.annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    private String[] fortunes = {
            "Lucky day, dude",
            "Good day",
            "Common day",
            "Not so good day",
            "Unlucky day",
            "Just awful day"
    };
    private final Random random = new Random();


    public String getFortune() {
        return fortunes[random.nextInt(fortunes.length)];
    }
}
