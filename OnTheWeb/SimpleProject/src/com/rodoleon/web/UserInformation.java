package com.rodoleon.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserInformation
 */
@WebServlet("/UserInformation")
public class UserInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInformation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = "Unknown";
		String lastName = "Unknown";
		String favoriteLanguage = "Unknown";
		String homeTown = "Unknown";
		if (request.getParameter("firstName") != null){
			firstName = request.getParameter("firstName");
		}if (request.getParameter("lastName") != null){
			lastName = request.getParameter("lastName");
		}if (request.getParameter("favoriteLanguage") != null){
			favoriteLanguage = request.getParameter("favoriteLanguage");
		}if (request.getParameter("homeTown") != null){
			homeTown = request.getParameter("homeTown");
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h2>Hello World, from "+firstName+" "+lastName+"</h2>");
		out.write("<p>Your favorite language is: " +favoriteLanguage+"</p>");
		out.write("<p>Your hometown is: "+homeTown+"</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
