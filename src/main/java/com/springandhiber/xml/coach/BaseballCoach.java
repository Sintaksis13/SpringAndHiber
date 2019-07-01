package com.springandhiber.xml.coach;

import com.springandhiber.xml.service.FortuneService;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice and " + getDailyFortune();
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
