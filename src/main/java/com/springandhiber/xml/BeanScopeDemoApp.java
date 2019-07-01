package com.springandhiber.xml;

import com.springandhiber.xml.coach.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach myCoach = context.getBean("myCoach", Coach.class);
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(myCoach == theCoach);
    }
}
