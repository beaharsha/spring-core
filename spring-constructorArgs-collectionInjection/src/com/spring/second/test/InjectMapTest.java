package com.spring.second.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.second.beans.ProjectManagerMap;

public class InjectMapTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com\\spring\\second\\config\\application-context-map.xml"));
		
		ProjectManagerMap map = factory.getBean("projectManagerMap", ProjectManagerMap.class);
		System.out.println(map.getProjectAndManager());
	}
}
