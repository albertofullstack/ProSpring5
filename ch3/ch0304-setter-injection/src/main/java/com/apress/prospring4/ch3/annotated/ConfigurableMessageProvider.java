package com.apress.prospring4.ch3.annotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.apress.prospring4.ch3.MessageProvider;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {

	private String message;
	
	@Autowired
	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
