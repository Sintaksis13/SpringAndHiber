package com.springandhiber.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springandhiber")
@PropertySource("classpath:sport.properties")
public class SportConfig {
}
