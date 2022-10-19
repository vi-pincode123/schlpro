package com.students.bean;

public class Students {
	private int sid;
	private String sname;
	private String dob;
	private String place;
	private String smail;
	private String spass;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getSmail() {
		return smail;
	}
	public void setSmail(String smail) {
		this.smail = smail;
	}
	public String getSpass() {
		return spass;
	}
	public void setSpass(String spass) {
		this.spass = spass;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", dob=" + dob + ", place=" + place + ", smail=" + smail
				+ ", spass=" + spass + "]";
	}
	

}
