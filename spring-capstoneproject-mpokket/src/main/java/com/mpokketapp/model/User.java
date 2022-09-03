package com.mpokketapp.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class User {
	private String userName;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO,generator ="user_gen")
	@SequenceGenerator(name = "user_gen",sequenceName = "user_sequence")
	private String userId;
	private LocalDate dob;
	@Enumerated
	private String  userType;
	@ManyToMany
	@JoinColumn(name = "loanId")
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
