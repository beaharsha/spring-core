package com.spring;


public class HtmlMessageProducer implements IMessageProducer{

	public String formatMessage(String data) {
		return "<html> "+"<body> "+data+" </body> "+"</html>";
	}
	
	public HtmlMessageProducer() {
		System.out.println("HtmlMessageProducer");
	}
}
