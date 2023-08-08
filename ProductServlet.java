package com.productwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet() method called");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int f=Integer.parseInt(request.getParameter("txtFnum"));
		int s=Integer.parseInt(request.getParameter("txtSnum"));
		int pdct=f*s;
		pw.println("Product of "+f+" and "+s+" is : "+pdct);
		pw.close();
	}

}
