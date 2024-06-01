package com.calci;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/calci")
public class Calci extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(req.getParameter("num"));
		int n2 = Integer.parseInt(req.getParameter("numb"));

		int add = n1 + n2, sub = n1 - n2, mul = n1 * n2, div = n1 / n2;

		if (req.getParameter("add") != null) {
			res.getWriter().print("<h1 align='center'>Addtion of numbers is: " + add + "</h1>");
		}

		else if (req.getParameter("sub") != null) {
			res.getWriter().print("<h1 align='center'>Substraction of numbers is: " + sub + "</h1>");
		}

		else if (req.getParameter("mul") != null) {
			res.getWriter().print("<h1 align='center'>Multiplaction of numbers is: " + mul + "</h1>");
		}

		else {
			res.getWriter().print("<h1 align='center'>Division of numbers is: " + div + "</h1>");
		}
		
	}

}
