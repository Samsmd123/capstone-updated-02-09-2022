package com.mpokketapp.service;

import java.util.List;

import com.mpokketapp.model.Loan;
import com.mpokketapp.model.User;

public interface ILoanService {
	
	void updateLoan(Loan loan);
	void deleteLoan(int loanId);
	List<Loan> getAll();
	Loan getByLoanId(int loanId);
	
	List<Loan>getByEmi(double emi);
	
	List<Loan>getByPrincipalAmountAndLoanType( double principalAmount,String  loanType);
	List<Loan>getByPrincipalAmountAndDuration(double principalAmount, int duration);
	
	
	
	
	
}
 