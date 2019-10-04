package com.beanscope.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.beanscope.beans.Car;

public class BeanInheritanceTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com\\beanscope\\config\\application-context.xml"));
		Car shift1 = factory.getBean("shift" , Car.class);
		System.out.println(shift1);
		Car shift2 = factory.getBean("shift" , Car.class);
		System.out.println(shift2);
		
		if(shift1 == shift2) {
			System.out.println("both are same objects");
		}
		else {
			System.out.println("prototypes objects ");
		}
	}
}
