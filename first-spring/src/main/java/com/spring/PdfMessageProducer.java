package com.spring;

public class PdfMessageProducer implements IMessageProducer{

	public String formatMessage(String data) {
		return "<PDF> "+data+" </PDF>";
	}

}
