package com.apress.prospring4.ch2.decoupled;

public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello world!";
	}
}
