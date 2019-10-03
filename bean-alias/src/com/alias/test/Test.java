package com.alias.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.alias.beans.Robot;

public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\alias\\config\\applicaton-context.xml"));
		
		Robot robot = factory.getBean("machine", Robot.class);
		System.out.println(robot);
		String[] aliases = factory.getAliases("robot");
		for(String s : aliases) {
			System.out.println(s);
		}
	}
}
