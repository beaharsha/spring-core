package com.spring;

public class MessageProducerFactory {
	
	public static IMessageProducer getInstance(String type) {
		if(type.equals("html")) {
			return new HtmlMessageProducer();
		}
		else if(type.equals("pdf")) {
			return new PdfMessageProducer();
		}
		else 
			return null;
	}

}
