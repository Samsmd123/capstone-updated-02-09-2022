package com.mpokketapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpokketapp.model.Loan;
@Repository
public interface ILoanRepository extends JpaRepository<Loan, Integer> {

	
	List<Loan> findAll();
	Loan findByLoanId(int loanId);
	
	List<Loan>findByEmi(double emi);
	//custom
	List<Loan>findByPrincipalAmountAndLoanType( double principalAmount,String  loanType);
	List<Loan>findByPrincipalAmountAndDuration(double principalAmount, int duration);
	
	
	
}
