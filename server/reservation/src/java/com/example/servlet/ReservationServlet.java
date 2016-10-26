package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.example.common.Version;
import com.example.dao.AttendantDAO;
import com.example.model.Attendant;

/**
 * Servlet implementation class ReservationServlet
 */
//@WebServlet("/ReservationServlet")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ReservationServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println( "<html><body>ReservationServlet 10/24 1111 ******     </body></html>" );
		String serverAction = request.getParameter("serverAction");
		System.out.println ("WIJS serverAction=" + serverAction);
		if (serverAction.equalsIgnoreCase("RequestTicket")) {
			System.out.println("WIJS: hit RequestTicket");
			Attendant attendant = new Attendant();
			attendant.setFirstName(request.getParameter("fname"));
			attendant.setLastName(request.getParameter("lname"));
			boolean returnCode = (new AttendantDAO()).createAttendant(attendant);
			if (returnCode) {
				System.out.println ("WIJS: Create Ticket Success ++++ ");
			} else {
				System.out.println ("WIJS: Create Ticket FAILED ----- ");
			}
		} else if (serverAction.equalsIgnoreCase("ListAll")) {
			System.out.println("WIJS: hit ListAll");
		}
		String[] abc = {"a" };
		
		Version.main(abc);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}





