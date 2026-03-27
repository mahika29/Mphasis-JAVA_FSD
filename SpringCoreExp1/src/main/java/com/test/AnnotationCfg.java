package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationCfg {
	@Bean
	public Employee getSetterObj() {
		return new Employee();
	}
	@Bean
	public Employee getConstructorObj() {
		return new Employee(222, "Mahika", "IDK");
		
	}

}
