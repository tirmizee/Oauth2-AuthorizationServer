package com.tirmizee.config;

import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class AppConfig {
	
	@Bean @SuppressWarnings("unchecked")
	public Map<String, String> queries(){
		Map<String, String> mapQueries = null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:jdbc-queries.xml")) {
			mapQueries = (Map<String, String>) context.getBean("queries");
		}
		return mapQueries;
	}

}
