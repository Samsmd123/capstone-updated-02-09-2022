package com.mpokketapp.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class User {
	private String userName;
	private String userId;
	private LocalDate dob;
	private String  userType;
	@OneToOne
	@JoinColumn(name= "loan_id")
	Set<Loan> loan;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String userId, LocalDate dob, String userType) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.dob = dob;
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", dob=" + dob + ", userType=" + userType + "]";
	}

	
	

}
