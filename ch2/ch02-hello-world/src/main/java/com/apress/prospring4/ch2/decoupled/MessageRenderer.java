package com.apress.prospring4.ch2.decoupled;

public interface MessageRenderer {
	void render();
	void setMessageProvider(MessageProvider mp);
	MessageProvider getMessageProvider();
}
