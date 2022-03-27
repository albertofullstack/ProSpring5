package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
	
    public static void main(String[] args) {
        try (GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {        	
        	ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        	ctx.refresh();
        	
        	MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
        	messageRenderer.render();
        	
        	MessageProvider messageProvider = ctx.getBean("messageProvider2", MessageProvider.class);
        	System.out.println(messageProvider.getMessage());
        }
    }
}
