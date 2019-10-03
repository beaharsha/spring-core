package com.collectionmerge.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.collectionmerge.beans.Course;

public class CollectionMergeTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com\\collectionmerge\\config\\application-context.xml"));
		Course eceCourse = factory.getBean("eceFirstYear", Course.class);
		System.out.println(eceCourse);
		Course cseCourse = factory.getBean("cseFirstYear", Course.class);
		System.out.println(cseCourse);
	}
}
