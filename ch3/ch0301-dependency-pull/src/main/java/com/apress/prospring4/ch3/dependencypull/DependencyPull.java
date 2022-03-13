package com.apress.prospring4.ch3.dependencypull;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyPull {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml")){
			MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
			mr.render();			
		}
	}

}
