package com.springandhiber.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    public String getDailyWorkout() {
        return "Tennis nigga!";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

    @Autowired
    public void doSomeShit(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
