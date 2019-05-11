package com.springandhiber;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //creating context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);
        //call methods on the bean
        System.out.println(coach.getDailyWorkout());
        //destroy context
        context.close();
    }
}
