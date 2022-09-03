package com.mpokketapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mpokketapp.calculator.Calculator;
import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.service.ILoanService;

@SpringBootApplication
public class SpringCapstoneprojectMpokketApplication implements CommandLineRunner{

	@Autowired
	ILoanService loanService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCapstoneprojectMpokketApplication.class, args);
	}

	@Autowired
	Calculator calculator ;	


	
	@Override
	public void run(String... args) throws Exception {
		
		double emi =calculator.calEmiEntrepreneur(12000, 2);
		System.out.println(emi);
		
		Loan loan = new Loan(LoanType.BUSINESSLOAN,12000.0,emi,2);
		
	}
	

}
