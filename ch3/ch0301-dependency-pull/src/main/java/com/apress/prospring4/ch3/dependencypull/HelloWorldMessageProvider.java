package com.apress.prospring4.ch3.dependencypull;

public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello world!";
	}
}
