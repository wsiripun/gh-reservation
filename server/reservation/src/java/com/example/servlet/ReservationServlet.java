package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReservationServlet
 */
//@WebServlet("/ReservationServlet")
//public class ReservationServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public ReservationServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter out = response.getWriter();
//		out.println( "<html><body>Hello World WIJS 10/11 ReservationServlet  </body></html>" );
////		response.sendRedirect("http://www.cnn.com"); 
//		out.close();
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
@SuppressWarnings("serial")
public class ReservationServlet extends HttpServlet{
	@Override
	public void service( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println( "<html><body>Hello World WIJS ****REAL ONE  !</body></html>" );
//		response.sendRedirect("http://www.cnn.com"); 
		out.close();
	}
	
}


//public class HelloWorldServlet extends HttpServlet
//{
//	@Override
//	public void service( HttpServletRequest request, HttpServletResponse response )
//			throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		out.println( "<html><body>Hello World WIJS 10/10/16, 999 wildfly!</body></html>" );
////		response.sendRedirect("http://www.cnn.com"); 
//		out.close();
//	}
//}
