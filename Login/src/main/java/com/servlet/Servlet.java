package com.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.RequestDispatcher;



@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String a=request.getParameter("txtName");
		String b=request.getParameter("txtPwd");
		Bean B=new Bean();
		B.setN(a);
		B.setP(b);
		
		CreateTable C=new CreateTable();
		
		if(C.Processing(B)==1) {
		
		 request.getRequestDispatcher("/success.jsp").include(request, response);
		}
		else {
			request.getRequestDispatcher("/fail.jsp").include(request, response);
		}
	}

}
