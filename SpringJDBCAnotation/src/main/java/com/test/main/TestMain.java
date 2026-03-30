package com.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.config.DBConfig;
import com.test.dao.BookDao;
import com.test.model.Book;

public class TestMain {
public static void main(String [] agrs) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);
	BookDao dao = ctx.getBean(BookDao.class);
	Book book = new Book();
	
	book.setB_id(101);
	book.setB_name("idk");
	book.setB_author("gfohe");
	book.setB_price(124);
	
	dao.saveBooks(book);
	
	System.out.println("Done!");
}
}
