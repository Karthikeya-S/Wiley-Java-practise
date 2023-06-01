package com.wiley.springcore.autowire.annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AWMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/annotation/config.xml");
		
		Employee emp1 = (Employee) context.getBean("emp1");
//		Employee emp2 = (Employee) context.getBean("emp2",Employee.class);
		Person p1 = (Person) context.getBean("p1");
		System.out.println(p1);
		System.out.println(emp1);
//		System.out.println(emp2);
	}
}
