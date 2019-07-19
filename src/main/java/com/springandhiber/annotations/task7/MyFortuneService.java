package com.springandhiber.annotations.task7;

import com.springandhiber.annotations.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class MyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Good day for fight";
    }
}
