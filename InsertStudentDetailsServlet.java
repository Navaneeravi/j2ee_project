package com.j2eeproject;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
//import java.io.PrintWriter;

import com.j2eeproject.dao.DataAccess;

/**
 * Servlet implementation class InsertStudentDetailsServlet
 */
public class InsertStudentDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertStudentDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name = request.getParameter("name");
		String degree = request.getParameter("degree");
		String stream = request.getParameter("stream");
		String mailid = request.getParameter("mailid");
		String state = request.getParameter("state");
		
		//PrintWriter out = response.getWriter();
		//out.println("name is ..." + name);
		//out.println("degree is..." + degree);
		//out.println("stream is..." + stream);
		//out.println("mailid is..." + mailid);
		//out.println("place is..." + place);
		
		DataAccess.insertstudent(name, degree, stream, mailid, state);
	}

}
