package com.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.service.EmployeeService;

public class TestDemo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService Service = ctx.getBean("employeeService", EmployeeService.class);
		
		System.out.println(Service.getEmployee().getName());
		
		Service.getEmployee().setName("Mahika");
		
		Service.getEmployee().throwException();
	}

}
