package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestDemo {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	Student obj = ctx.getBean("std",Student.class);
	System.out.println(obj);

	ExpressionParser exp = new SpelExpressionParser();
	Expression ex = exp.parseExpression("'Simple spring EL(SpEl) example'");
	String data = ex.getValue(String.class);
	
	//two types of string creating methods string buffer and string builder
	/*String str = "Simple Spring EL(SpEL) example";//contains object
	String str1 = new String("Simple Spring EL(SpEL) example");//contains 
	
	System.out.println(str == str1);*/
	
	System.out.println(data+"Literals");
	
	Expression ex1 = exp.parseExpression("'Simple spring EL(SpEl) example'".toUpperCase());
	String dt = ex1.getValue(String.class);
	System.out.println(dt);
	
	Expression ex2 = exp.parseExpression("500*3");
	Integer v = ex2.getValue(Integer.class);
	System.out.println(v);
	System.out.println("5000*2");

}

}
