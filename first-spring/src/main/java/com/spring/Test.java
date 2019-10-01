package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		/*
		 * MessageWriter writer = new MessageWriter(); IMessageProducer producer =
		 * MessageProducerFactory.getInstance("pdf");
		 * writer.setMessageProducer(producer); writer.show("Welcome to Patterns");
		 */
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/spring/config/app-config.xml"));
//		ApplicationContext factory = new ClassPathXmlApplicationContext("com/spring/config/app-config123.xml");
		
		/*IMessageProducer messageProducer = 
				factory.getBean("htmlMessageProducer" , HtmlMessageProducer.class);*/
		MessageWriter writer = (MessageWriter) factory.getBean("messageWriter");
		MessageWriter writer1 = (MessageWriter) factory.getBean("messageWriter");
//		writer.setMessageProducer(messageProducer);
		
		writer.show("Welcome to Spring");
		writer1.show("Welcome to Spring");
		
		if(writer == writer1) {
			System.out.println("both are same writer objects");
		}
	}
}
