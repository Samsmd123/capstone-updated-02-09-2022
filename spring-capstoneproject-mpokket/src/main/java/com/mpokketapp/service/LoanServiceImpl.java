package com.mpokketapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpokketapp.model.Loan;
import com.mpokketapp.repository.ILoanRepository;

@Service
public class LoanServiceImpl implements ILoanService{

	@Autowired
	ILoanRepository loanRepository;
	@Override
	public void updateLoan(Loan loan) {
		loanRepository.save(loan);
		
	}

	@Override
	public void deleteLoan(int loanId) {
		loanRepository.deleteById(loanId);
		
	}
	
		
	

	@Override
	public List<Loan> getAll() {
		
		return loanRepository.findAll();
	}

	@Override
	public Loan getByLoanId(int loanId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> getByEmi(double emi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> getByPrincipalAmountAndLoanType(double principalAmount, String loanType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> getByPrincipalAmountAndDuration(double principalAmount, int duration) {
		// TODO Auto-generated method stub
		return null;
	}










	

}
