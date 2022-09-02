package com.mpokketapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Loan {
	
	
	private String  loanType;
	private Integer loanId;
	@OneToMany(mappedBy = "Loan") 
	Set<User> user;
	private Double principalAmount;
	private Double emi;
	private Integer duration;
	
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Loan( String loanType, Double principalAmount, Double emi, Integer duration) {
		super();
		
		this.loanType = loanType;
		this.principalAmount = principalAmount;
		this.emi = emi;
		this.duration = duration;
	}

	
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	public Set<User> getUser() {
		return user;
	}
	public void setUser(Set<User> user) {
		this.user = user;
	}
	public Double getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(Double principalAmount) {
		this.principalAmount = principalAmount;
	}
	public Double getEmi() {
		return emi;
	}
	public void setEmi(Double emi) {
		this.emi = emi;
	}
	
	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Loan [loanType=" + loanType + ", loanId=" + loanId + ", user=" + user
				+ ", principalAmount=" + principalAmount + ", emi=" + emi + ", duration=" + duration + "]";
	}
	
}
