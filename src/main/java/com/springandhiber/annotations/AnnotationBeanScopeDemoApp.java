package com.springandhiber.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(String.format("Is theCoach == alphaCoach? The answer is %s\n",
                String.valueOf(theCoach == alphaCoach).toUpperCase()));

        System.out.println("theCoach address: " + theCoach);
        System.out.println("alphaCoach address: " + alphaCoach);

        System.out.println("Team = " + theCoach.getTeam() + ", email = " + theCoach.getEmail());

        context.close();
    }
}
