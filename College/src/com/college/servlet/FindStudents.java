package com.college.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.college.model.College;
import com.college.model.Course;
import com.college.model.Student;

/**
 * Servlet implementation class FindStudents
 */
@WebServlet("/FindStudents")
public class FindStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String selected = request.getParameter("course");
		
		ArrayList<Student> tempStuList = new ArrayList<>();
		
		
		for(Student stu: College.students) {
			for(Course course: stu.getCourses()) {
				
				if(selected.equalsIgnoreCase(course.getName())) {
					tempStuList.add(stu);
				}
			}
		}
//		out.println(tempStuList.get(0));
//		
//	
//		
//		
//		
		
		request.setAttribute("foundStu", tempStuList);
//		
		RequestDispatcher dispatch = request.getRequestDispatcher("checkStudent.jsp");
//		
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
