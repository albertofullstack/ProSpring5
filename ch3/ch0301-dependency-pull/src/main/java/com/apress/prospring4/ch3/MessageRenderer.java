package com.apress.prospring4.ch3;

public interface MessageRenderer {
	void render();
	void setMessageProvider(MessageProvider mp);
	MessageProvider getMessageProvider();
}
