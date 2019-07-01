package com.springandhiber.xml.coach;

import com.springandhiber.xml.service.FortuneService;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Run a hard 5k and " + getDailyFortune();
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void initMethod() {
        System.out.println("TrackCoach: init");
    }

    public void destroyMethod() {
        System.out.println("TrackCoach: destroy");
    }
}
