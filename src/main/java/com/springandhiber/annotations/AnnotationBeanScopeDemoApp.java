package com.springandhiber.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(String.format("Is theCoach == alphaCoach? The answer is %s\n",
                String.valueOf(theCoach == alphaCoach).toUpperCase()));

        System.out.println("theCoach address: " + theCoach);
        System.out.println("alphaCoach address: " + alphaCoach);

        context.close();
    }
}
