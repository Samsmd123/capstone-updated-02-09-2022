package com.mpokketapp.model;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Loan {
	
	@Enumerated(EnumType.STRING)
	private Loan  loanType;

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO,generator ="loan_gen")
	@SequenceGenerator(name = "loan_gen",sequenceName = "loan_sequence",initialValue =1001,allocationSize =1)
	private Integer loanId;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name ="userId")
	Set<User> user;
	private Double principalAmount;
	private Double emi;
	private Integer duration;
	
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Loan( Loan loanType, Double principalAmount, Double emi, Integer duration) {
		super();
		
		this.loanType = loanType;
		this.principalAmount = principalAmount;
		this.emi = emi;
		this.duration = duration;
	}

	
	public Loan getLoanType() {
		return loanType;
	}
	public void setLoanType(Loan loanType) {
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
