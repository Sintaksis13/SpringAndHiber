package com.springandhiber.annotations;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {
    private String[] fortunes;
    private final Random random = new Random();

    @PostConstruct
    private void fillUpFortunes() throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(this.getClass().getResourceAsStream("/fortunes.txt"))
        )) {
            fortunes = reader.lines().toArray(String[]::new);
        }
    }

    public String getFortune() {
        return fortunes[random.nextInt(fortunes.length)];
    }
}
