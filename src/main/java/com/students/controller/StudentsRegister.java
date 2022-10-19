package com.students.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.students.bean.Students;
import com.students.dao.StudentDao;
@WebServlet("/reg")
public class StudentsRegister extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		String sname = request.getParameter("sname");
		String dob = request.getParameter("dob");
		String place = request.getParameter("place");
		String smail = request.getParameter("smail");
		String spass = request.getParameter("spass");
		Students s = new Students();
		s.setSname(sname);
		s.setDob(dob);
		s.setPlace(place);
		s.setSmail(smail);
		s.setSpass(spass);
		int i = StudentDao.addstud(s);
		if(i>0) {
			out.print("success");
		}else {
			out.print("failed");
		}
	}
	
}

