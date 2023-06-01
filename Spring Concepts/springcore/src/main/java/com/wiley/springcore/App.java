package com.wiley.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student st1 = (Student) context.getBean("wileystudent1");
        Student st2 = (Student) context.getBean("wileystudent2");
        Student st3 = (Student) context.getBean("student5");
//        System.out.println(st1);
//        System.out.println(st2);
        System.out.println(st3);
    }
}
