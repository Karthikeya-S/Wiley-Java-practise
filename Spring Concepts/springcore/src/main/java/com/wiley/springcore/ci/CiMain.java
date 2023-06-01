package com.wiley.springcore.ci;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/ci/config.xml");
//		Person p = (Person) context.getBean("p1");
//		Person p1 = (Person) context.getBean("p2");
		Person p2 = (Person) context.getBean("p3");
//		System.out.println(p);
//		System.out.println(p1);
		System.out.println(p2);
	}
}
