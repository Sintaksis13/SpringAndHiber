package com.springandhiber.xml;

import com.springandhiber.xml.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //initialize application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from the spring container
        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
        //call bean methods
        System.out.println(coach.getDailyWorkout() + " and " + coach.getDailyFortune());

        System.out.println("\nemail: " + coach.getEmailAddress() + "\nteam: " + coach.getTeam());
        //close application context
        context.close();
    }
}
