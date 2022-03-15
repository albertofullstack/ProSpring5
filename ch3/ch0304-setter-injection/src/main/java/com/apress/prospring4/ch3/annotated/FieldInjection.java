package com.apress.prospring4.ch3.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;

public class FieldInjection {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/annotation.xml");
		ctx.refresh();
		
		Singer singerBean = ctx.getBean(Singer.class);
		singerBean.sing();
		
		ctx.close();
	}
}
