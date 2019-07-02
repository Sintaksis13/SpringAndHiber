package com.springandhiber.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    @Value("${foo.team}")
    private String team;

    @Autowired
    public TennisCoach(@Qualifier("fileFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Initialization!");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Destroying...");
    }

    public String getDailyWorkout() {
        return "Tennis nigga! And your team is '" + team + "'";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }
}
