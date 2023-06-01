package com.wiley.springcore.stereotype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.Student;
public class CompMain {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/stereotype/config.xml");
	Student student = context.getBean("sob",Student.class);
}
