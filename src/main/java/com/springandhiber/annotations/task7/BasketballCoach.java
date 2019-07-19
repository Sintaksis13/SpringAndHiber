package com.springandhiber.annotations.task7;

import com.springandhiber.annotations.Coach;
import com.springandhiber.annotations.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public BasketballCoach(@Qualifier("myFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
