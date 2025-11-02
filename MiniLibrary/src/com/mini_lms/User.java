package com.mini_lms;
import java.util.Date;

public class User {
	private int userNo;
	private String fName;
	private String lName;
	private Date dob;
	
	

	public User() {
		// TODO Auto-generated constructor stub
	}



	public User(int userNo, String fName, String lName, Date dob) {
		super();
		this.userNo = userNo;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
	}



	public int getUserNo() {
		return userNo;
	}



	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}



	public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	

}
