package com.springandhiber.xml.service;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private String[] fortunes;
    private final Random random = new Random();

    public RandomFortuneService() {
        this.fortunes = new String[] {"You will die!", "That's your best day!", "Winter is coming..."};
    }

    public String getFortune() {
        return fortunes[random.nextInt(3)];
    }
}
