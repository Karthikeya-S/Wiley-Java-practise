package com.wiley.springcore.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/reftype/config.xml");
		WileyA wa = (WileyA) context.getBean("waref");
		WileyA wa1 = (WileyA) context.getBean("waddref1");
		System.out.println(wa.getOb().getCount());
		System.out.println(wa1.getWadd().getAddress());
	}
}
