package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloWorldServlet extends HttpServlet
{
	@Override
	public void service( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		// Add new line.
		out.println( "<html><body>Hello World WIJS 1111 MODIFIED HELLO WORLD</body></html>" );
//		response.sendRedirect("http://www.cnn.com"); 
		out.close();
	}
}