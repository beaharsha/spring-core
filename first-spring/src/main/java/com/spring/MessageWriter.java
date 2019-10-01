package com.spring;

public class MessageWriter {
	private IMessageProducer messageProducer;
	
	public void show(String data) {
//		messageProducer =  MessageProducerFactory.getInstance("pdf");
		String formatMessage = messageProducer.formatMessage(data);
		System.out.println(formatMessage);
	}

	public MessageWriter(IMessageProducer messageProducer) {
		System.out.println("MessageWriter");
		this.messageProducer = messageProducer;
	}

	public void setMessageProducer(IMessageProducer messageProducer) {
		System.out.println("setMessageProducer");
		this.messageProducer = messageProducer;
	}
	
	 /*public MessageWriter() {
		System.out.println("MessageWriter");
	}*/
	
}
