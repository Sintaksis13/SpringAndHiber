package com.springandhiber.annotations.task7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplicationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyAppConfig.class);

        BasketballCoach bean = context.getBean(BasketballCoach.class);

        System.out.println(bean.getFortune());
    }
}
