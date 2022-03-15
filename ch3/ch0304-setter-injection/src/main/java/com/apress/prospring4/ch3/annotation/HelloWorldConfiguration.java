package com.apress.prospring4.ch3.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//@ComponentScan(basePackages = {"com.apress.prospring5.ch3.annotation"})
@ImportResource(locations = {"classpath:spring/app-context-xml.xml"})
@Configuration
public class HelloWorldConfiguration {
}
