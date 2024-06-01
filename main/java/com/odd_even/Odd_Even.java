package com.odd_even;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/odd-even")
public class Odd_Even extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int n =Integer.parseInt(req.getParameter("oddeve"));
		
		if(n%2 == 0)
		{
			res.getWriter().print("<h1 align='center'>The number "+n+" is a Even </h1>");
		}
		else
		{
			res.getWriter().print("<h1 align='center'>The number "+n+" is a Odd </h1>");
		}
	}

}
