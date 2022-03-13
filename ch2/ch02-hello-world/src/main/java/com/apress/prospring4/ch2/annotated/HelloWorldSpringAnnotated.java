package com.apress.prospring4.ch2.annotated;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apress.prospring4.ch2.decoupled.MessageRenderer;

public class HelloWorldSpringAnnotated {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
			MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
			mr.render();			
		}
	}
}
