package com.spring.second.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.second.beans.Robot;

public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com\\spring\\second\\config\\applicaton-context.xml"));
		// cntr+shift+F -> fomatting java code
//		Robot robot = factory.getBean("robot", Robot.class);
//		System.out.println(robot);
		Robot robot1 = factory.getBean("robot1", Robot.class);
		System.out.println(robot1);
		
	}
}
