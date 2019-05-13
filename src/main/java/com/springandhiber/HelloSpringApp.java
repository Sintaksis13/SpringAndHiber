package com.springandhiber;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //initialize application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from the spring container
        Coach coach = context.getBean("myCoach", Coach.class);
        //call bean methods
        System.out.println(coach.getDailyWorkout());
        //close application context
        context.close();
    }
}
