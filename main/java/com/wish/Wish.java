package com.wish;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Wish")
public class Wish extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name= req.getParameter("name");
		res.getWriter().print("<h1 align='center'>"+"Wishing you Happy Birthday "+name+"</h1>");
		
		
	}

}
