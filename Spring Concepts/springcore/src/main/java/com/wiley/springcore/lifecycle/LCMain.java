package com.wiley.springcore.lifecycle;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/lifecycle/config.xml");
		Pizza pizza = (Pizza) context.getBean("pizza1");
		System.out.println(pizza);
		context.registerShutdownHook();
	}
}
