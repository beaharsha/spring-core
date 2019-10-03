package com.inheriance.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.inheriance.beans.Car;

public class BeanInheritanceTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com\\inheriance\\config\\application-context.xml"));
		Car shift1 = factory.getBean("shift1" , Car.class);
		System.out.println(shift1);
		Car shift2 = factory.getBean("shift2" , Car.class);
		System.out.println(shift2);
	}
}
