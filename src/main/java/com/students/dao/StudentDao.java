package com.students.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.students.bean.Students;

public class StudentDao {
	

	public static Connection getCon() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb","root","rootpassword");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}

	public static int addstud(Students s) {
		int status = 0;
		try {
			String sql = "insert into stud(sname,dob,place,smail,spass) values(?,?,?,?,?)";
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, s.getSname());
			ps.setString(2, s.getDob());
			ps.setString(3, s.getPlace());
			ps.setString(4, s.getSmail());
			ps.setString(5, s.getSpass());
			status = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}

	public static List<Students> getAllStudents() {
		List<Students> studlist = new ArrayList<>();
		try {
			String sql = "select * from stud";
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Students std = new Students();
				std.setSid(rs.getInt(1));
				std.setSname(rs.getString(2));
				std.setDob(rs.getString(3));
				std.setPlace(rs.getString(4));
				std.setSmail(rs.getString(5));
				std.setSpass(rs.getString(5));
				studlist.add(std);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return studlist;
	}

}
