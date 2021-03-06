package com.student.servelet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.model.Student;

/**
 * Servlet implementation class DisplayAllStudents
 */
@WebServlet("/DisplayAllStudents")
public class DisplayAllStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Student> allstudents = new ArrayList<>();
		
		allstudents.add(new Student("Vishal", 23 , "Programming", "vishal@gmail.com"));
		allstudents.add(new Student("Abhishek", 23 , "C++", "abhi@gmail.com"));
		allstudents.add(new Student("Hardip", 23 , "Java", "hardip@gmail.com"));
		
		request.setAttribute("students", allstudents);
		
		//Request Dispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("displayStudents.jsp");
		
		dispatcher.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
