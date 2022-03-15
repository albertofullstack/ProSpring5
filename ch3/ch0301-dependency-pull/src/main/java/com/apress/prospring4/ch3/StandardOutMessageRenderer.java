package com.apress.prospring4.ch3;

import org.springframework.beans.factory.annotation.Autowired;

public class StandardOutMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider;
	
	@Override
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException("You must set the property messageProvider of class:" + 
					StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

	@Override
	@Autowired
	public void setMessageProvider(MessageProvider mp) {
		messageProvider = mp;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return messageProvider;
	}
}
