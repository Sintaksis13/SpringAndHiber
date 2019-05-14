package com.springandhiber;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Cricket for the best!";
    }

    public String getDailyFortune() {
        return "Oops, that's gonna be hard...";
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
