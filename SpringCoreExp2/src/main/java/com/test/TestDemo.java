package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	public static void main(String[] args) {
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Employee obj = ctx.getBean("emp", Employee.class);
		System.out.println(obj);
		*/
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnConfig.class);
		
	    Address adr1 = ctx.getBean("getAdrObj", Address.class);
	    adr1.setCity("hyd");
	    adr1.setState("AP");
	    
	    Address adr2 = ctx.getBean("getAdrObj", Address.class);
	    adr1.setCity("mumbia");
	    adr1.setState("MH");
	    
	    List<Address> list = Arrays.asList(adr1,adr2);
	    
	    Employee emp = ctx.getBean("getEmployeeObj", Employee.class);
	    emp.setId(101);
	    emp.setName("Mahika");
	    emp.setCompany("gefiuhef");
	    
	    emp.setAdr(list);
	    System.out.println(emp);
	    
	}

}
