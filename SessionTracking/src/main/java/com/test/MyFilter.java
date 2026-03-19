package com.test;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/Login")
public class MyFilter extends HttpFilter  {
       
  
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("filter destory()");

	}

	//we can uses these filters when we want to do encryption or any decrption and like from bg files to small files and many more 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
        System.out.println("Before servlet");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		//gives the permission for any update or any changes the FilterChain does that 
		System.out.println("after servlet");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter init()");
		// TODO Auto-generated method stub
	}

}
