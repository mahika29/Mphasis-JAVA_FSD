package com.test;

import java.util.List;

public class OrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderDao odao=new OrderDao();
		Order obj=new Order();
		//obj.setId(2);
		obj.setO_name("fruits grapes");
		obj.setO_quantity(3000);
		obj.setO_price(14044);
		
		//odao.saveOrder(obj);
		odao.updateOrder(obj);
		//odao.deleteOrder(obj);
		List<Order> list=odao.listAllOrders();
		list.forEach(dt->System.out.println(dt.getId()+" "+dt.getO_name()+" "+dt.getO_quantity()+" "+dt.getO_price()));
		
		System.out.println("done");
		

	}

}
