package com.test;

import java.util.List;

public class StudentDemo {
	public static void main(String[]args) {
		StudentDao sdao=new StudentDao();
		Student obj=new Student();
		obj.setName("Harshini");
		obj.setMarks(90);
		
		
		sdao.saveStudent(obj);
//		obj.setId(52);
//		obj.setO_name("book");
//		obj.setO_price(250);
//		obj.setO_quantity(2);
		
		//odao.saveOrder(obj);
		//odao.UpdateOrder(obj);
		//odao.deleteOrder(obj);
		List<Student> list=sdao.listAllOrders();
		
		list.forEach(dt -> System.out.println(dt.getId()+" "+dt.getName()+" "+dt.getMarks()));
	System.out.println("Done.");
	}


}
