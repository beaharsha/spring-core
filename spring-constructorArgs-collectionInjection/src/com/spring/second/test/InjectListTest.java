package com.spring.second.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.second.beans.EmployeeAsList;

public class InjectListTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com\\spring\\second\\config\\application-context-list.xml"));

		EmployeeAsList employeeAsList = factory.getBean("employeeBean", EmployeeAsList.class);
		System.out.println(employeeAsList.getEmployee());
	}

}
