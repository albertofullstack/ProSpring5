package com.apress.prospring4.ch2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.prospring4.ch2.decoupled.MessageRenderer;

public class HelloWorldSpringDI {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml")){
			MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
			mr.render();			
		}
	}
}
