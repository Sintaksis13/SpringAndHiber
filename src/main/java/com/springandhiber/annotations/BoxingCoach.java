package com.springandhiber.annotations;

import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach {
    public String getDailyWorkout() {
        return "Jab jab, hook!";
    }

    public String getFortune() {
        return null;
    }
}
