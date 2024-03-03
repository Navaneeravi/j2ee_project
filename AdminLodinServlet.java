package com.j2eeproject;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.j2eeproject.dao.DataAccess;

/**
 * Servlet implementation class AdminLodinServlet
 */
public class AdminLodinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLodinServlet() {
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
		//below code is to verify if data is coming from html page
		
				String email = request.getParameter("email");
				String pw = request.getParameter("pw");
				PrintWriter out = response.getWriter();
				out.println("email : " + email);
				out.println("pw : " +pw);
				
				//verification over
				
				boolean result = DataAccess.checkAdminLogin(email, pw);
				
				if(result == true)
				{
					//out.println("LOGIN SUCCESS");
		              response.sendRedirect("welcome.jsp");
					
				}
				else
				{
					out.println("LOGIN FAIL");
				}
		
	}

}
